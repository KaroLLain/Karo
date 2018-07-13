package com.kodilla.testing.library;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<>();
            for(int n=1; n<= booksQuantity; n++){
                Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
                resultList.add(theBook);
            }

            return resultList;
    }

    private LibraryDataBase libraryDataBaseMock;
    private BookLibrary bookLibrary;

    @Before
    public void beforeEachTest(){
        libraryDataBaseMock = mock(LibraryDataBase.class);
        bookLibrary = new BookLibrary(libraryDataBaseMock);
    }

    @Test
    public void testListBookWithConditionReturnList(){
        //Given
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDataBaseMock.listBookWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBookWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testBookWithConditionMoreThan20(){
        //Given
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDataBaseMock.listBookWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDataBaseMock.listBookWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDataBaseMock.listBookWithCondition("FortyBooks"))
                    .thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBookWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBookWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBookWithCondition("FortyBooks");


        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBookWithConditionFragmentShorterThan3(){
        //Given
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDataBaseMock.listBookWithCondition(anyString())).thenReturn(resultListOf10Books);

        //When
        List<Book> theListOf10Books = bookLibrary.listBookWithCondition("An");

        //Then
        assertEquals(0, theListOf10Books.size());
        verify(libraryDataBaseMock, times(0)).listBookWithCondition(anyString());

    }

    @Test
    public void testBooksInHandsOfLibraryUserIs0(){
        //Given
        List<Book> listOf0Books = generateListOfNBooks(0);
        when(libraryDataBaseMock.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(listOf0Books);

        //When
        List<Book> theListBooksInHandsOf = bookLibrary.listBooksInHandsOf(isA(LibraryUser.class));

        //Then
        assertEquals(0, theListBooksInHandsOf.size());
        verify(libraryDataBaseMock, atLeastOnce()).listBooksInHandsOf(any(LibraryUser.class));
    }

    @Test
    public void testBooksInHandsOfLibraryUserIs1(){
        //Given
        List<Book> listOf1Book = generateListOfNBooks(1);
        when(libraryDataBaseMock.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(listOf1Book);

        //When
        List<Book> theListBooksInHandsOf = bookLibrary.listBooksInHandsOf(isA(LibraryUser.class));

        //Then
        assertEquals(1, theListBooksInHandsOf.size());
        verify(libraryDataBaseMock, atLeastOnce()).listBooksInHandsOf(any(LibraryUser.class));
    }

    @Test
    public void testBooksInHandsOfLibraryUserIs5(){
        //Given
        List<Book> listOf5Books = generateListOfNBooks(5);
        when(libraryDataBaseMock.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(listOf5Books);

        //When
        List<Book> theListOfBooksInHandsOf = bookLibrary.listBooksInHandsOf(isA(LibraryUser.class));

        //Then
        assertEquals(5, theListOfBooksInHandsOf.size());
        verify(libraryDataBaseMock, atLeastOnce()).listBooksInHandsOf(any(LibraryUser.class));
    }


}
