package com.kodilla.kodilla.hibernate.taskList.dao;

import com.kodilla.kodilla.hibernate.taskList.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

}
