/*
 * Include a main method that creates an ArrayList of Integer type and fills it
 * with a random list of 100 Integers in the range from 0 to 10.  Then ask the
 * user for a value and print the count of occurrences of the value in the list
 * by getting the count from the generic method.
 */

package ce2336hw51;
/**
 *
 * @author Daniel Heironimus
 */
public class DemoMain {
    public static void main(String[] args) {
        //create list and random number generator using current time as seed
        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
        java.util.Random rand = new java.util.Random(System.currentTimeMillis());
        int key;
        //populate list using random
        //Instructions not 100% clear, so made the numbers include both 0 and 10
        for(int i=0; i<100; i++){
            list.add(rand.nextInt(11));
        }
        //gets user input and stores it
        java.util.Scanner reader = new java.util.Scanner(System.in);
        System.out.println("Enter the number to check: ");
        key=reader.nextInt();
        //runs the Demo method
        System.out.println(Demo.occurences(list, key));
    }

}
