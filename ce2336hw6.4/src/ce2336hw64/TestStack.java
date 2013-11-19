/*
 *  Create a class called TestStack.  Its main method should create
 *  a stack using the GenStack class.  Next read a string from the user.
 *  Taking into consideration whether the number of characters is even
 *  or odd, traverse the string by character pushing enough of them
 *  onto the stack so that the remaining characters can be compared
 *  as they are popped to determine whether the string is a palindrome.
 *  If all of the characters match, print the string is a palindrome.
 *  If any do not match, print that the string is not a palindrome.
 */

package ce2336hw64;

/**
 *
 * @author Daniel Heironimus
 */
public class TestStack {

    public static void main(String[] args) {
        boolean test = true;
        String temp,pal;
        GenStack<Character> stack = new GenStack<Character>();
        java.util.Scanner reader = new java.util.Scanner(System.in);
        System.out.println("Enter the string to check:");
        temp=reader.nextLine();
        pal=temp.toLowerCase();

        /*
         * code to remove non-letters if you're checking
         * a sentence or paragraph
         *
        String safe="abcdefghijklmnopqrstuvwxyz";
        pal="";
        for(char c:temp.toCharArray()){
            for(char o:safe.toCharArray()){
                if(o==c)
                    pal+=c;
            }
        }
         * 
         */
        for(int i=0;i<pal.length();i++){
            if(i<pal.length()/2)
                stack.push(pal.charAt(i));
            else if(i>=(pal.length()-pal.length()/2)){
                if(pal.charAt(i)!=stack.pop()){
                    System.out.println("This string is not a palindrome.");
                    test = false;
                    break;
                }
            }
        }
        if(test)
            System.out.println("This string is a palindrome.");
    }

}
