package com.kodilla.kodilla.hibernate.taskList.dao;

import com.kodilla.kodilla.hibernate.task.Task;
import com.kodilla.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.kodilla.hibernate.taskList.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "To Do";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, "To do list");
        //When
        taskListDao.save(taskList);
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);
        //Then
        Assert.assertEquals(1, readTaskList.size());
        Assert.assertEquals(LISTNAME, readTaskList.get(0).getListName());
        //CleanUp
        taskListDao.delete(taskList);
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        taskListDao.delete(id);
    }

}
