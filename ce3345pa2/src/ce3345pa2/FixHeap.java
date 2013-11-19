/*
The keys in a binary heap are according to the heap-order property.
Suppose that they are scrambled. Write a program FixHeap.java fixing
the heap. Use the array representation of the heap. The keys should be
provided in a string as the input (so that TA can run it as
"java FixHeap string"). Implement 3 ways of fixing the heap and
compute the number of swaps in each (3 numbers).

1) Fixing the heap. Repeat the following step: find the two nodes with
indices i and j such that Heap[i] and Heap[j] are not in heap-order
and j is maximum, then swap them. Fix the heap and count the number of
swaps.

2) Fix the heap by constructing it. Take the input sequence of
numbers and insert them into an empty heap. Count the total number of
swaps in all insertions.

3) Construction of the heap by merging. Use the algorithm with O(n)
running time (using downheap to restore the heap-order property).
Count the total number of swaps.
 */

package ce3345pa2;
import java.util.ArrayList;
/**
 *
 * @author aksfjh
 */

class Tree {
    public ArrayList<Integer> tree;
    public int swaps;

    Tree(){
        this.tree = new ArrayList<Integer>();
        this.tree.add(0);
        this.swaps = 0;
    }
    Tree(ArrayList<Integer> tree){
        this();
        this.tree.addAll(tree);
        for(int i=tree.size()/2; i>0; i--){
            percolateDown(i);
        }
    }
    Tree(int i){
        this();
        this.tree.add(i);
    }

    public void add(int i){
        this.tree.add(i);
        percolateUp(this.tree.size()-1);
    }

    public void add(ArrayList<Integer> heap){
        this.tree.addAll(heap);
        for(int i=tree.size()/2; i>0; i--){
            percolateDown(i);
        }

    }

    public void add(Tree heap){
        this.tree.addAll(heap.tree);
        tree.remove(tree.lastIndexOf(0));
        for(int i=tree.size()/2; i>0; i--){
            percolateDown(i);
        }
    }

    private void percolateDown(int index){
        int left = index*2;
        int right = index*2+1;
        int child;
        if(index*2>=tree.size()){
            return;
        }
        else if(index*2 == tree.size()-1){
            child = left;
        }
        else{
            if(tree.get(left)<tree.get(right))
                child = left;
            else
                child = right;
        }
        if(tree.get(index)>tree.get(child)){
            swap(index, child);
            percolateDown(index*2);
        }
    }

    private void percolateUp(int index) {
        while(index > 0){
            if(tree.get(index)<tree.get(index/2)){
                swap(index, index/2);
                index = index/2;
            }
            else{
                break;
            }
        }
    }

    public void swap(int i, int j){
        System.out.println("Swapping "+ tree.get(i) +" and " + tree.get(j));
        int temp = tree.get(i);
        tree.set(i, tree.get(j));
        tree.set(j, temp);
        swaps++;
    }

    public static void printTree(ArrayList<Integer> tree){
        String innerSpace = " ", outerSpace = "";
        int endPlace, startPlace = tree.size();
        String newDepth, finalTree = "";

        for(int level = (int) Math.log(startPlace) + 1; level >= 0; level--){
                endPlace = startPlace;
                newDepth = outerSpace;
                startPlace = (int) (Math.pow(2, level));
                //subtract 1 from startPlace if your array starts at 0.

                for(int i = startPlace; i < endPlace; i++)
                        newDepth += tree.get(i) + innerSpace;

                outerSpace = innerSpace;
                innerSpace = innerSpace + innerSpace + " ";

                finalTree = newDepth + "\n" + finalTree;
        }

        System.out.println(finalTree);
    }


}
public class FixHeap {
    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        Tree tree;
        int size = args.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        String[] arr = args;
        // Check if args[] is empty
        if (size == 0){
            arr = new String[]{"9","8",
            "7","6","5","4","3","2","1"};
            System.out.println("Input is empty, using default array: ");
            for(String s : arr){
                System.out.print(s + " ");
            }
            System.out.println();
        }
        for (String i : arr){
            list.add(Integer.parseInt(i));
        }
        Tree.printTree(list);
        list.remove(0);
        // For loop fills ArrayList with contents of args[]
        System.out.print(
                "*****************************\n"
               +"         Sort inside         \n"
               +"*****************************\n");
        
        tree = new Tree(list);
        System.out.println("Total swaps: " + tree.swaps);
        tree.printTree(tree.tree);
        System.out.print(
                "*****************************\n"
               +"       Sort insertion        \n"
               +"*****************************\n");

        tree = new Tree();
        for(int i : list){
            tree.add(i);
        }
        System.out.println("Total swaps: " + tree.swaps);
        tree.printTree(tree.tree);

        System.out.print(
                "*****************************\n"
               +"             Merge           \n"
               +"*****************************\n");
        //split the list in half
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.addAll(list.subList(list.size()/2, list.size()-1));
        list.removeAll(list2);
        tree = new Tree(list);
        Tree tree2 = new Tree(list2);
        tree.add(tree2);

        System.out.println("Total swaps: " + tree.swaps);
        tree.printTree(tree.tree);
    }
}
