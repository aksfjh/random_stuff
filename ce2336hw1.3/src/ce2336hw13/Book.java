package ce2336hw13;

/**
 *
 * @author Daniel Heironimus
 */


public class Book {
    // create variables for each book
    private String title;
    private String author;
    private int pages;
    // create static variables for keeping track of book sizes
    private static int small;
    private static int large;
    //no-arg constructor, doesn't modify static variables
    public Book(){
        this.title = "";
        this.author = "";
        this.pages = 0;
    }
    //arg constructor, modifies static variables based on pages
    public Book(String newTitle, String newAuthor, int newPages){
        this.title = newTitle;
        this.author = newAuthor;
        this.pages = newPages;
        if(newPages>200){
            large++;
        }
        else{
            small++;
        }
    }
    //prints book information
    public void printBook(){
        System.out.println(this.title + ", by " + this.author + ", " + this.pages + " pages");
    }
    //prints all book information on size
    public static void printCount(){
        System.out.println("Currently " + small + " small books, " + large + " large books");
    }
    //methods for displaying key variables
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPages(){
        return pages;
    }
}
