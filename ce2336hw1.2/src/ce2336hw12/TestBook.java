/* Write a class called "Book".  A book has a title, an author, and a number of pages.
*    The Book class has a constructor to set these three fields.  A book with fewer than
*    200 pages is a small book.  A book with 200 or more pages is a large book.  The Book
*    class keeps track of how many large and small books have been created using static fields.
*
*    The Book class has two display methods, printBook and printCount.
*
*    The printBook method displays like this:
*       Beginning Java, by Jacobsen, 250 pages
*
*    The static printCount method displays like this:
*       Currently 203 small books, 750 large books
*
*   Write a separate class called "TestBook" that creates two large books and two small books.
*   It should then display the books and the count of books.
*/
 package ce2336hw12;

/**
 *
 * @author Daniel Heironimus
 */
public class TestBook {

    public static void main(String[] args) {
        Book a = new Book("Big Book of Small Words", "D. Heironimus", 385);
        Book b = new Book("Children's Tale", "A. R. Parkins", 22);
        Book c = new Book("Every Slide Show Ever", "Various Authors", 21538413);
        Book d = new Book("Comics", "Rob Smith", 122);
        a.printBook();
        Book.printCount();
    }

}
