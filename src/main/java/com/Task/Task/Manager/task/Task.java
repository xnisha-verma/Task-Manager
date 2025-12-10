package com.Task.Task.Manager.task;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDate duedate;

    public enum Status{
        TODO,
        IN_PROGRESS,
        DONE
    }

    public Task(){

    }
    public Task(String title, String description, LocalDate duedate, Status status){
        this.title=title;
        this.description=description;
        this.status=status;
        this.duedate=duedate;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDuedate() {
        return duedate;
    }

    public void setDuedate(LocalDate duedate) {
        this.duedate = duedate;
    }

    public String toString() {
        return "Task{" +
                "id=" + id +
                ",title=" +  title + '\''+
                ", description=" + description + '\''+
                ", duedate" + duedate +
                ", status=" + status +
                "}";
    }
}
