package com.shabab477.graphql.notepad.demo.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.shabab477.graphql.notepad.demo.dao.NotepadRepository;
import com.shabab477.graphql.notepad.demo.entity.Notepad;
import com.shabab477.graphql.notepad.demo.graphql.model.Note;
import com.shabab477.graphql.notepad.demo.graphql.model.Task;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.stream.Collectors;

public class NoteQueryResolver implements GraphQLQueryResolver {
    private NotepadRepository notepadRepository;

    public NoteQueryResolver(NotepadRepository notepadRepository) {
        this.notepadRepository = notepadRepository;
    }

    public List<Note> getRecentNotes(int count, int offset) {
        Pageable request = PageRequest.of(offset, count);

        return notepadRepository
                .findAll(request)
                .stream()
                .map(notepad -> new Note(
                    String.valueOf(notepad.getId()),
                    notepad.getTasks().size(),
                    notepad.getDescription(),
                    notepad.getDescription(),
                    notepad.getTasks()
                            .stream()
                            .map(task -> new Task(task.getId().toString(), task.getTaskName()))
                            .collect(Collectors.toList())
                ))
                .collect(Collectors.toList());
    }


}
