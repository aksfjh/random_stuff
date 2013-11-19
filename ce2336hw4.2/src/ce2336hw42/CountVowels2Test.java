/*Write a class called CountVowels2.  Another way to count the vowels in a
 string is to divide the string into two halves, and recursively add the count
 in the left half to the count in the right half.  Write a recursive method to
 count the vowels in a string using this approach.  Include a main method to
 demonstrate your recursive method.
 */

package ce2336hw42;

/**
 *
 * @author Daniel Heironimus
 */
public class CountVowels2Test {
    public static void main(String[] args) {
        //create string array to test method
        String[] s={"The quick brown fox",
        "jumps over",
        "the lazy dog",
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "abcdefghijklmnopqrstuvwxyz"};
        for(String c:s){
            //CountVowels2 has static methods, so no need to create
            //object for it
            System.out.println(c+ ": " +CountVowels2.count(c));
        }
    }

}
