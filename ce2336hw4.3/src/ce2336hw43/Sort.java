package ce2336hw43;

/**
 *
 * @author Daniel Heironimus
 */
import java.util.List;


public class Sort{
    //no variables needed, just static methods
    //method just takes list input and calls same method
    public static void intSort(List<Integer> ls){
        intSort(ls,ls.size()-1);
    }
    //method that actually runs bubblesort with recursion
    private static void intSort(List<Integer> ls, int index){
        int index2=0;
        for(int i=0; i<index;i++){
            if(ls.get(i)>ls.get(i+1)){
                int temp=ls.get(i);
                ls.set(i, ls.get(i+1));
                ls.set(i+1, temp);
                index2 = i;
            }
        }
        if(index>0)
            intSort(ls,index2);
    }
}