/*
 * Write a generic class called Demo.  It should have a generic method that
 * receives a List of the generic type and a value of the generic type.  It
 * should return the count of occurrences of the value in the collection.
 *
 * Include a main method that creates an ArrayList of Integer type and fills it
 * with a random list of 100 Integers in the range from 0 to 10.  Then ask the
 * user for a value and print the count of occurrences of the value in the list
 * by getting the count from the generic method.
 */

package ce2336hw51;
import java.util.ArrayList;
/**
 *
 * @author Daniel Heironimus
 */
public class Demo<T> {
    //counts the occurences of the key in the list of objects
    public static <E> int occurences(ArrayList<E> list, E key){
        //initialize the count
        int count = 0;
        //iterate through the list checking each object with key
        for(int i=0;i<list.size();i++){
            if(key.equals(list.get(i)))
                    count++;
        }
        return count;
    }
}
