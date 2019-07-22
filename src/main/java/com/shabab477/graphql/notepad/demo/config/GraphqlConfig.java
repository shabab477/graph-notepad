package com.shabab477.graphql.notepad.demo.config;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import com.shabab477.graphql.notepad.demo.dao.NotepadRepository;
import com.shabab477.graphql.notepad.demo.dao.TasksRepository;
import com.shabab477.graphql.notepad.demo.graphql.resolver.NoteQueryResolver;
import com.shabab477.graphql.notepad.demo.graphql.resolver.TaskResolver;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import graphql.servlet.DefaultGraphQLSchemaProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.URL;

@Configuration
public class GraphqlConfig {
    private GraphQL graphQL;

    @Autowired
    private NotepadRepository notepadRepository;

    @Autowired
    private TasksRepository tasksRepository;

    @Bean
    public NoteQueryResolver getNoteQueryResolver() {
        System.out.println("bean loaded");
        return new NoteQueryResolver(notepadRepository);
    }

    @Bean
    public TaskResolver getTasksResolver() {
        return new TaskResolver();
    }
}
