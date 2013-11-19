/*
 * First create two classes, Book and a subclass called PaperbackBook.
 * The constructor of each just stores the name of the book.
 *
 * Then write a generic class called Demo2.  It should have a generic
 * method called Copy that receives two generic lists named source and
 * target, and copies all entries from source to target after clearing
 * target.  The method should be written so that the target's List
 * type can be a super class of the source's List type.
 *
 * Write a main method that creates a List<Book> and a
 * List<PaperbackBook>, each having at least 3 books.  Then call Copy
 * to copy from List<PaperbackBook> to List<Book>. Print both lists
 * before and after the call to Copy.
 */

package ce2336hw52;

/**
 *
 * @author Daniel Heironimus
 */
import java.util.ArrayList;

public class BookMain {
    public static void main(String[] args) {
        //creates lists and populates them
        ArrayList<Book> books = new ArrayList<Book>();
        ArrayList<PaperbackBook> paperbacks = new ArrayList<PaperbackBook>();
        books.add(new Book("Hardcover"));
        books.add(new Book("Undercover"));
        books.add(new Book("Supercop"));
        paperbacks.add(new PaperbackBook("Flimsy"));
        paperbacks.add(new PaperbackBook("Cookbook for Fun"));
        paperbacks.add(new PaperbackBook("Best Seller #2"));
        paperbacks.add(new PaperbackBook("C++ for Java Developers"));
        //prints the lists of books/paperbacks
        System.out.println("Before:\nBooks " + books);
        System.out.println("Paperbacks " + paperbacks);
        //calls the copy method to duplicate books into paperbacks
        Demo2.Copy(paperbacks, books);
        //prints the lists of books/paperbacks
        System.out.println("After:\nBooks " + books);
        System.out.println("Paperbacks " + paperbacks);
    }

}
