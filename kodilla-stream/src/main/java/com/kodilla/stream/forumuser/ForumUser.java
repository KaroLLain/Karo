package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userIdentifier;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int noOfWrittenPosts;

    public ForumUser(int userIdentifier, String userName, char sex, LocalDate dateOfBirth, int noOfWrittenPosts) {
        this.userIdentifier = userIdentifier;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.noOfWrittenPosts = noOfWrittenPosts;
    }

    public int getUserIdentifier() {
        return userIdentifier;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNoOfWrittenPosts() {
        return noOfWrittenPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userIdentifier=" + userIdentifier +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", noOfWrittenPosts=" + noOfWrittenPosts +
                '}';
    }
}
