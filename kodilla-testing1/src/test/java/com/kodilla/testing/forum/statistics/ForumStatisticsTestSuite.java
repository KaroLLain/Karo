package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.*;

import static org.mockito.Mockito.*;


public class ForumStatisticsTestSuite {

    private static int testCounter = 0;
    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test No." + testCounter);

        statisticsMock = mock(Statistics.class);
        List<String> usersListMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            usersListMock.add("User");
        }
        when(statisticsMock.userName()).thenReturn(usersListMock);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);
        forumStatistics = new ForumStatistics();
        System.out.println("Users quantity is: " + usersListMock.size());

    }
    @After
    public void afterEveryTest() {

        System.out.println("Posts quantity is: " + statisticsMock.postsCount() + "/n");
        System.out.println("Comments quantity is: " + statisticsMock.commentsCount() + "/n");
        System.out.println("Average comments for user is: " + forumStatistics.getAverageCommentsForUser() + "/n");
        System.out.println("Average comments for post is: " + forumStatistics.getAverageCommentsForPost() + "/n");
        System.out.println("Average posts for user is: " + forumStatistics.getAveragePostsForUser());
        System.out.println(" ");
    }

    @Test
    public void testWhenPostsQuantityIs0() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getPostsNo());
        Assert.assertEquals(0.00, forumStatistics.getAveragePostsForUser(), 0.02);
        Assert.assertEquals(0.00, forumStatistics.getAverageCommentsForPost(), 0.02);

    }
    @Test
    public void testWhenPostsQuantityIs1000() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1000, forumStatistics.getPostsNo());
        Assert.assertEquals(100, forumStatistics.getAveragePostsForUser(), 0.01);
        Assert.assertEquals(0.02, forumStatistics.getAverageCommentsForPost(), 0.7);

    }


    @Test
    public void testWhenCommentsQuantityIs0() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getCommentsNo());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsForUser(), 0.01);
        Assert.assertEquals(0, forumStatistics.getAverageCommentsForPost(), 0.01);
    }

    @Test
    public void testWhenCommentsQuantityIsLowerThanPostsQuantity() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(20);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(20, forumStatistics.getPostsNo());
        Assert.assertEquals(5, forumStatistics.getCommentsNo());
        Assert.assertEquals(2, forumStatistics.getAveragePostsForUser(), 0.01);
        Assert.assertEquals(0.5, forumStatistics.getAverageCommentsForUser(), 0.7);
        Assert.assertEquals(0.25, forumStatistics.getAverageCommentsForPost(), 0.7);
    }

    @Test
    public void testWhenCommentsQuantityIsHigherThanPostsQuantity() {

        //Given
        when(statisticsMock.commentsCount()).thenReturn(20);
        when(statisticsMock.postsCount()).thenReturn(5);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(5, forumStatistics.getPostsNo());
        Assert.assertEquals(20, forumStatistics.getCommentsNo());
        Assert.assertEquals(0.5, forumStatistics.getAveragePostsForUser(), 0.7);
        Assert.assertEquals(2, forumStatistics.getAverageCommentsForUser(), 0.01);
        Assert.assertEquals(4, forumStatistics.getAverageCommentsForPost(), 0.01);

    }

    @Test
    public void testWhenUsersQuantityIs0() {

        //Given
        List<String>listMock = new ArrayList<>();
        when(statisticsMock.userName()).thenReturn(listMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getUsersNo());
        Assert.assertEquals(0, forumStatistics.getAveragePostsForUser(), 0.01);
        Assert.assertEquals(0, forumStatistics.getAverageCommentsForUser(), 0.01);


    }
    @Test
    public void testWhenUsersQuantityIs100() {

        //Given
        List<String> listMock = new ArrayList<>();
        for(int i=0; i<100; i++){
            listMock.add("User");
        }
        when(statisticsMock.userName()).thenReturn(listMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, forumStatistics.getUsersNo());
        Assert.assertEquals(20, forumStatistics.getCommentsNo());
        Assert.assertEquals(10, forumStatistics.getPostsNo());
        Assert.assertEquals(0.1, forumStatistics.getAveragePostsForUser(), 0.7);
        Assert.assertEquals(0.2, forumStatistics.getAverageCommentsForUser(), 0.7);


    }


}
