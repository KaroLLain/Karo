package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("Things to do: ")
    public TaskList toDoList;

    @Autowired
    @Qualifier("Task in progress: ")
    public TaskList inProgressList;

    @Autowired
    @Qualifier("Done tasks: ")
    public TaskList doneList;

    @Bean
    public Board board() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }
    @Bean(name = "Things to do: ")
    public TaskList getToDoList() {
        return new TaskList();
    }
    @Bean(name = "Task in progress: ")
    public TaskList getInProgressList() {
        return new TaskList();
    }
    @Bean(name = "Done tasks: ")
    public TaskList getDoneList() {
        return new TaskList();
    }
}
