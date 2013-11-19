/*Write a class called TestHash.  In main, read the words from the words.txt
    file into an ArrayList of Strings.  Next, create a map using the MyHashMap
    created in problem 1.  Add all of the words from the ArrayList into the
    map (the word can be both key and data).  Afterwards, call the methods
    you added to print the collision count, max list size, and average list
    size.  Run for MyHashMaps having the following initial sizes and
    load factors:

      1000   .5
      1000    1
      1000    5
      8000    1
 */

package ce2336hw81;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Daniel Heironimus
 */
public class TestHash {
    /**Creates the maps needed to test different load factors and sizes,
     * then runs them through the test method.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException{
        MyHashMap<String,String> testmap1 =
                new MyHashMap<String,String>(1000, (float)0.5);
        MyHashMap<String,String> testmap2 =
                new MyHashMap<String,String>(1000, (float) 1);
        MyHashMap<String,String> testmap3 =
                new MyHashMap<String,String>(1000, (float) 5);
        MyHashMap<String,String> testmap4 =
                new MyHashMap<String,String>(8000, (float) 1);
        System.out.println("Case 1: Capactity 1000, load factor 0.5");
        test(testmap1);
        System.out.println("\nCase 2: Capactity 1000, load factor 1");
        test(testmap2);
        System.out.println("\nCase 3: Capactity 1000, load factor 5");
        test(testmap3);
        System.out.println("\nCase 4: Capactity 8000, load factor 1");
        test(testmap4);
    }

    /**Opens the file to be read, puts each line into a map, then prints
     * the required results (the tested new methods)
     * @param testmap
     * @throws IOException
     */
    static void test(MyHashMap testmap) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("words.txt"));
        try {
            String line = br.readLine();
            while (line != null) {
                testmap.put(line, line);
                line = br.readLine();
            }
        }
        finally {
            br.close();
        }
        System.out.println("Value collisions: " + testmap.countCollisions());
        System.out.println("Max list size: " + testmap.maxListSize());
        System.out.println("Average list size: " + testmap.avgListSize());

    }
}
