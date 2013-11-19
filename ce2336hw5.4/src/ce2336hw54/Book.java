package ce2336hw54;

/**
 *
 * @author Daniel Heironimus
 */
public class Book {
    String title;
    //Constructor
    Book(String title){
        this.title = title;
    }
    //Override for toString
    @Override public String toString(){
        return title;
    }
}
