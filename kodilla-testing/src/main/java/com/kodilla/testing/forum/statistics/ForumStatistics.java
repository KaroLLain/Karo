package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    int usersNo;
    int postsNo;
    int commentsNo;
    double averagePostsForUser;
    double averageCommentsForUser;
    double averageCommentsForPost;
    boolean valueZero;

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersNo = statistics.userName().size();
        this.postsNo = statistics.postsCount();
        this.commentsNo = statistics.commentsCount();

        if(postsNo > 0) {
            if(usersNo>0){
            this.averageCommentsForUser = commentsNo / usersNo;
            this.averageCommentsForPost = commentsNo / postsNo;
            this.averagePostsForUser = postsNo / usersNo;
        }}else {
            this.valueZero=false;
        }
    }



    public int getUsersNo() {
        return usersNo;
    }

    public int getPostsNo() {
        return postsNo;
    }

    public int getCommentsNo() {
        return commentsNo;
    }

    public double getAveragePostsForUser() {
        return averagePostsForUser;
    }

    public double getAverageCommentsForUser() {
        return averageCommentsForUser;
    }

    public double getAverageCommentsForPost() {
        return averageCommentsForPost;
    }
}
