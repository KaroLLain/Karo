package com.kodilla.kodilla.hibernate.task;

import com.kodilla.kodilla.hibernate.taskList.TaskList;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "TABLE")
public class Task {
    private int id;
    private String description;
    private Date created;
    private int duration;
    private TaskFinancialDetails taskFinancialDetails;
    private TaskList taskList;

    public Task(String description, int duration) {
        this.description = description;
        this.duration = duration;
        this.created = new Date();
    }

    public Task(){}

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }
    @NotNull
    @Column(name = "CREATED")
    public Date getCreated() {
        return created;
    }
    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }
    @JoinColumn(name = "TASK FINANCIALS_ID")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }

    @ManyToOne
    @JoinColumn(name = "TASKLIST_ID")
    public TaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
        this.taskFinancialDetails = taskFinancialDetails;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setCreated(Date created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }
}
