package ce2336hw43;
import java.util.*;
/**
 *
 * @author Daniel Heironimus
 */
public class Main {
    public static void main(String[] args) {
        //Generates list of 20 random numbers from 0-100
        List<Integer> test = new ArrayList<Integer>();
        Random rand = new Random(System.currentTimeMillis());
        for(int i=0;i<20;i++){
            test.add(rand.nextInt(100));
        }
        //outputs list before sort
        System.out.println(test);
        //sorts list
        Sort.intSort(test);
        //outputs list after sort
        System.out.println(test);
    }

}
