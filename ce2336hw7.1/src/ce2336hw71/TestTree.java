/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ce2336hw71;

/**
 *
 * @author aksfjh
 */
public class TestTree {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<Integer>();
        MyLinkedList<Integer> linked = new MyLinkedList<Integer>();
        java.util.Random rand =
                new java.util.Random(System.currentTimeMillis());
        int current;
        for(int i=0; i<100000;i++){
            current = rand.nextInt(100000)+1;
            linked.add(current);
            tree.insert(current);
        }
        long linked_time = System.currentTimeMillis();
        for(int i=1;i<=100000;i++){
            linked.contains(i);
        }
        linked_time=System.currentTimeMillis()-linked_time;
        long tree_time = System.currentTimeMillis();
        for(int i=1;i<=100000;i++){
            tree.search(i);
        }
        tree_time=System.currentTimeMillis()-tree_time;
        System.out.println("Time to search linked list: "+linked_time);
        System.out.println("Time to search binary search tree: "+tree_time);
    }
}
