package com.shabab477.graphql.notepad.demo.entity;

import javafx.concurrent.Task;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "notes")
public class Notepad implements Serializable {
    public static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;

    @OneToMany(
        cascade = CascadeType.ALL,
        mappedBy = "tasks_id"
    )
    private List<Task> tasks = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
