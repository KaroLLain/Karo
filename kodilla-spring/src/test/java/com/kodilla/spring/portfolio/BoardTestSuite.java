package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

            //given
            ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
            Board board = context.getBean(Board.class);
            //when
            board.getToDoList().getTasks().add("Task no 1");
            board.getDoneList().getTasks().add("Task no 2");
            board.getInProgressList().getTasks().add("Task no 3");
            //then
            Assert.assertEquals("Task no 1", board.getToDoList().getTasks().get(0));
            Assert.assertEquals("Task no 2", board.getDoneList().getTasks().get(0));
            Assert.assertEquals("Task no 3", board.getInProgressList().getTasks().get(0));
        }
}
