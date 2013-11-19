/*
 * Write a generic class called Shelf.  A Shelf contains a list of Books.
 * Its generic type is bounded by Book so that it will accept Book
 * objects or subclasses of Book.

 * It has an add method which adds a book to the end of the list, and a
 * toString method that prints the list.

 * Include a main method that creates a Shelf of Books and stores one
 * each of a Book and PaperbackBook in the Shelf, then prints the Shelf.
 * Use the Book and PaperbackBook classes from problem 2 above.
 */

package ce2336hw54;

/**
 *
 * @author Daniel Heironimus
 */
public class ShelfTest {
    public static void main(String[] args) {
        //creates objects
        Shelf<Book> testshelf = new Shelf<Book>();
        PaperbackBook paper = new PaperbackBook("Paperback book");
        Book hard = new Book("Normal book");
        //adds the 2 kinds of books to the shelf
        testshelf.addItem(hard);
        testshelf.addItem(paper);
        //prints shelf
        System.out.println(testshelf);
    }

}
