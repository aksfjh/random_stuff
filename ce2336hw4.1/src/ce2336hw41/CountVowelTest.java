package ce2336hw41;

/**
 *
 * @author Daniel Heironimus
 */
public class CountVowelTest {
    public static void main(String[] args) {
        //create string array to test method
        String[] s={"The quick brown fox",
        "jumps over",
        "the lazy dog",
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "abcdefghijklmnopqrstuvwxyz"};
        for(String c:s){
            //CountVowels has static methods, so no need to create object for it
            System.out.println(c+ ": " +CountVowels.count(c));
        }
        
    }

}
