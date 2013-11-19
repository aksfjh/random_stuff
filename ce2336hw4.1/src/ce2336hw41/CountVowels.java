/*Write a class called CountVowels.  Write a recursive method to count the
 vowels in a string.  The count of vowels in a string can be found recursively
 by counting whether or not the first character is a vowel, and adding the
 count of the vowels in the rest of the string.  Include a main method to
 demonstrate your recursive method.
 */

package ce2336hw41;

/**
 *
 * @author Daniel Heironimus
 */
public class CountVowels {
    //static variables and methods
    //string array of vowels
    static private String[] vowelArray = {"a","e","i","o","u"};
    //recursive method to count vowels in string
    static public int count(String s){
        int vowels=0;
        if(!s.isEmpty()){
            for(String c : vowelArray){
                vowels = (s.toLowerCase().startsWith(c)?vowels+1:vowels);
            }
            vowels += count(s.substring(1));
        }
        return vowels;
    }
}
