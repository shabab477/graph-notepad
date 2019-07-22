package com.shabab477.graphql.notepad.demo.graphql.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Note implements Serializable {
    public static final long serialVersionUID = 1L;

    private String id;
    private int totalTask;
    private String description;
    private String minifiedDescription;
    private List<Task> tasks = new ArrayList<>();

    public Note(String id, int totalTask, String description, String minifiedDescription, List<Task> tasks) {
        this.id = id;
        this.totalTask = totalTask;
        this.description = description;
        this.minifiedDescription = minifiedDescription;
        this.tasks = tasks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTotalTask() {
        return totalTask;
    }

    public void setTotalTask(int totalTask) {
        this.totalTask = totalTask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMinifiedDescription() {
        return minifiedDescription.length() <= 10? minifiedDescription : (minifiedDescription.substring(0, 10) + "...");
    }

    public void setMinifiedDescription(String minifiedDescription) {
        this.minifiedDescription = minifiedDescription;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
