package ce2336hw42;

/**
 *
 * @author Daniel Heironimus
 */
public class CountVowels2 {
    //static variables and methods
    //string array of vowels
    static private String[] vowelArray = {"a","e","i","o","u"};
    //recursive method to count vowels in string
    //If length of s>1, it splits it in 2
    //else, checks if the string is a vowel
    static public int count(String s){
        int vowels=0;
        if(s.length()>1){
            vowels = count(s.substring(0, s.length()/2))+
                    count(s.substring(s.length()/2));
        }
        else{
             for(String c:vowelArray){
                 vowels +=(s.equalsIgnoreCase(c)?1:0);
             }
        }
        return vowels;
    }

}
