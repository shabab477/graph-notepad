package com.shabab477.graphql.notepad.demo.graphql.model;

import java.io.Serializable;

public class Task implements Serializable {
    public static final long serialVersionUID = 1L;

    private String id;
    private String description;

    public Task(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
