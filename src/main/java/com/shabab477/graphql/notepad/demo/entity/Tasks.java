package com.shabab477.graphql.notepad.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity(name = "tasks")
public class Tasks implements Serializable {
    public static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String taskName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}