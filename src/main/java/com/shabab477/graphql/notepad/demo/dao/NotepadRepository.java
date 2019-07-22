package com.shabab477.graphql.notepad.demo.dao;

import com.shabab477.graphql.notepad.demo.entity.Notepad;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NotepadRepository extends PagingAndSortingRepository<Notepad, Long> {
}
