package prototype.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite{

    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Library");
        Book book1 = new Book("Amok", "John String", LocalDate.of(1987, Month.FEBRUARY, 21));
        Book book2 = new Book("Coco", "Anabelle Martin", LocalDate.of(2005, Month.DECEMBER, 16));
        Book book3 = new Book("Amber", "Robin Crust", LocalDate.of(1999, Month.AUGUST, 12));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Shallow Copy - Library");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep Copy - Library");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        //When
        library.removeBook(book2);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
