package ce2336hw52;

import java.util.ArrayList;
/**
 *
 * @author Daniel Heironimus
 */
public class Demo2<E> {
    //one static method to copy contents
    public static <T> void Copy(ArrayList<T> source,
            ArrayList<? super T> target){
        //clears target, the adds the collection source to target
        target.clear();
        target.addAll(source);
    }
}
