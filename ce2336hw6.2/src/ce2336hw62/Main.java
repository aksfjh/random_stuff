/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ce2336hw62;
import java.util.ArrayList;
/**
 *
 * @author aksfjh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLinkedList<Integer> i = new MyLinkedList<Integer>();
        i.add(1);
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(5);
        i.add(8);
        i.add(1);
        ArrayList<Integer> lol= new ArrayList<Integer>();
        lol.add(1);
        lol.add(1);
        lol.add(3);
        lol.add(4);
        System.out.println(i.size);

        System.out.println(i.removeAll(lol));
        System.out.println(i.size);
        System.out.println(i);
    }

}
