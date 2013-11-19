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

import java.util.ArrayList;
/**
 *
 * @author Daniel Heironimus
 */

//Generic class only takes objects that are classes or subclasses of Book
public class Shelf<T extends Book> {
    //generic book list
    ArrayList<T> items = new ArrayList<T>();
    //method to add books to the list
    public void addItem(T item){
        this.items.add(item);
    }
    //override toString method, output separates books on new lines:
    //Book1
    //Book2
    //etc
    @Override public String toString(){
        String out = "";
        if(items.size()>0){
            out = items.get(0).toString();
        }
        if(items.size()>1){
            for(Object e : items.subList(1, items.size())){
                out+="\n"+e.toString();
            }
        }
        return out;
    }
}
