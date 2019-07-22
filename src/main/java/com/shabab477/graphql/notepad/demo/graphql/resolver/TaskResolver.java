package com.shabab477.graphql.notepad.demo.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.shabab477.graphql.notepad.demo.graphql.model.Note;
import com.shabab477.graphql.notepad.demo.graphql.model.Task;

import java.util.List;

public class TaskResolver implements GraphQLResolver<Task> {

    public List<Task> getTask(Note note) {
        return note.getTasks();
    }
}
