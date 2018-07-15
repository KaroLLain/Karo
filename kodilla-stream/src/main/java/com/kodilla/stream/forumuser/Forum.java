package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){

        forumUserList.add(new ForumUser(1, "Marek Nowicki", 'M', LocalDate.of(1988, Month.AUGUST, 20), 11));
        forumUserList.add(new ForumUser(2, "Adam Paluch", 'M', LocalDate.of(1969, Month.FEBRUARY, 13), 46));
        forumUserList.add(new ForumUser(3, "Agnieszka Stasz", 'F', LocalDate.of(1956, Month.DECEMBER, 12), 121));
        forumUserList.add(new ForumUser(4, "Renata Polak", 'F', LocalDate.of(1987, Month.NOVEMBER, 1), 58));
        forumUserList.add(new ForumUser(5, "Jan Kowalski", 'M', LocalDate.of(1985, Month.MARCH, 8), 98));
        forumUserList.add(new ForumUser(6, "Marta Ptyś", 'F', LocalDate.of(1996, Month.MAY, 17), 1));
        forumUserList.add(new ForumUser(7, "Jerry Orwell", 'M', LocalDate.of(1965, Month.MAY, 21), 5));
        forumUserList.add(new ForumUser(8, "Caroline Wild", 'F', LocalDate.of(1986, Month.JANUARY, 10), 16));
        forumUserList.add(new ForumUser(9, "Jeff Freeman", 'M', LocalDate.of(1987, Month.APRIL, 17), 0));
        forumUserList.add(new ForumUser(10, "Anastasia Kovalsky", 'F', LocalDate.of(1995, Month.JULY, 3), 221));
        forumUserList.add(new ForumUser(11, "Criss Wholeburn", 'M', LocalDate.of(2001, Month.OCTOBER, 1), 134));
        forumUserList.add(new ForumUser(12, "Aurelie Smith", 'F', LocalDate.of(1994, Month.DECEMBER, 1), 41));
    }

    public List<ForumUser> getForumUserList(){

        return new ArrayList<>(forumUserList);
    }
}
