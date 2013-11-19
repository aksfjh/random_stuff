/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ce2336hw61;

/**
 *
 * @author aksfjh
 */
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> i = new MyArrayList<Integer>();
        i.add(1);
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(5);
        i.add(8);
        ArrayList<Integer> lol= new ArrayList<Integer>();
        lol.add(1);
        lol.add(1);
        lol.add(3);
        lol.add(4);
        System.out.println(i.size);

        System.out.println(i.addAll(6,lol));
        System.out.println(i.size);
        System.out.println(i);
    }
}
