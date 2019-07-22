package com.shabab477.graphql.notepad.demo.dao;

import com.shabab477.graphql.notepad.demo.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TasksRepository extends CrudRepository<Task, Long> {
}
