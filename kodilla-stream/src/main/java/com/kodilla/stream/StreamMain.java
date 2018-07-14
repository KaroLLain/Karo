package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[]args) {

        //lambda - ExpressionExecutor

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("*** Calculating expressions with lambdas ***");
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a + b));
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a - b));
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a * b));
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a / b));
        System.out.println(" ");

        System.out.println("*** Calculating expressions with method references ***");
        expressionExecutor.executeExpression(10,5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10,5, FunctionalCalculator::subAfromB);
        expressionExecutor.executeExpression(10,5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(10,5, FunctionalCalculator::divideAByB);
        System.out.println(" ");

        //beautifier - PoemBeautifier

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("*** Beautifying in progress... ***");
        String beautyPoem1 = poemBeautifier.beautify("Beautify me...", (text) -> "ABC " + text + "ABC");
        System.out.println("1. " + beautyPoem1);
        String beautyPoem2 = poemBeautifier.beautify("Beautify me...", (text) -> text.toUpperCase());
        System.out.println("2. " + beautyPoem2);
        String beautyPoem3 = poemBeautifier.beautify("Beautify me...", (text) -> {
            String a = "a";
            StringBuilder aB = new StringBuilder(a);
            for (int i=0; i<=4; i++){
                aB.append("a");
            }
            return aB.toString() + " " + text;
        });
        System.out.println("3. " + beautyPoem3);
        String beautyPoem4 = poemBeautifier.beautify("Beautify me...", (text) -> "I am " + text.substring(0, 7) + "ul!");
        System.out.println("4. " + beautyPoem4);
        System.out.println(" ");

        //iterate - NumbersGenerator

        System.out.println("*** Using stream to generate even numbers from 1 to 20 ***");
        NumbersGenerator.generateEven(20);
        System.out.println(" ");

        //person - People

        System.out.println("*** Stream List of names: ***");

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(s ->System.out.println(s));
        System.out.println(" ");

        //book - Book

        System.out.println("*** Stream List of books: ***");

        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);
        System.out.println(" ");

        System.out.println("*** Stream Collectors (Kolektory) - toList(): ***");
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);
        System.out.println(" ");

        System.out.println("*** Stream Collectors (Kolektory) - toMap(): ***");
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
        System.out.println(" ");

        System.out.println("*** Stream Collectors (Kolektory) - joining(): ***");
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<" , ">>"));
        System.out.println(theResultStringOfBooks);
        System.out.println(" ");

        //forumUser - list of Forum Users
        System.out.println("*** Stream list of Forum Users: ***");
        Forum theForum = new Forum();
        LocalDate ageValidator = LocalDate.of(1998, 7, 14);
        Map<Integer, ForumUser> resultMapOfForumUsers = theForum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(ageValidator))
                .filter(forumUser -> forumUser.getNoOfWrittenPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserIdentifier, forumUser -> forumUser));
        System.out.println("# elements: " + resultMapOfForumUsers.size());
        resultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
