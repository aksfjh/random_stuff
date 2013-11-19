/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ce3445project;
import java.util.*;
/**
 *
 * @author aksfjh
 */
public class MergeSort {
    public static int comparisons;

    public ArrayList<Integer> triSort(ArrayList<Integer> list){
        comparisons = 0;
        if(list.size()<3){
            return sort(list);
        }
        int div1 = list.size()/3;
        int div2 = div1*2;
        return triMerge(sort(list.subList(0, div1)),sort(list.subList(div1, div2)),sort(list.subList(div2,list.size())));
    }

    public ArrayList<Integer> sort(List<Integer> list){
        if(list.size() <2){
            ArrayList<Integer> temp = new ArrayList();
            temp.addAll(list);
            return temp;
        }
        int middle = list.size()/2;
        ArrayList<Integer> left = new ArrayList();
        left.addAll(list.subList(0, middle));
        ArrayList<Integer> right = new ArrayList();
        right.addAll(list.subList(middle, list.size()));
        left = sort(left);
        right = sort(right);
        return merge(left,right);
    }

    public ArrayList<Integer> triMerge(ArrayList<Integer> left, ArrayList<Integer> middle, ArrayList<Integer> right){
        ArrayList<Integer> list = new ArrayList();
        int i=0, j=0, k=0;
        for(int c = 0; c<left.size()+middle.size()+right.size();c++){
            if(i<left.size() && j<right.size() && k<middle.size()){
            if(left.get(i)<right.get(j)){
                comparisons++;
                if(left.get(i)<middle.get(k)){
                    comparisons++;
                    list.add(left.get(i));
                    i++;
                }
                else{
                    list.add(middle.get(k));
                    k++;
                }
            }
            else{
                if(right.get(j)<middle.get(k)){
                    comparisons++;
                    list.add(right.get(j));
                    j++;
                }
                else{
                    list.add(middle.get(k));
                    k++;
                }
            }
            }
            if(i >= left.size()){
                list.addAll(merge(middle.subList(k, middle.size()),right.subList(k,right.size())));
                c = list.size();
            }
            else if(j >= right.size()){
                list.addAll(merge(middle.subList(k, middle.size()),left.subList(i,left.size())));
                c = list.size();
            }
            else if(k >= middle.size()){
                list.addAll(merge(left.subList(i, left.size()),right.subList(k,right.size())));
                c = list.size();
            }
        }
        return list;
    }

    public ArrayList<Integer>
            merge(List<Integer> left, List<Integer> right){
        ArrayList<Integer> list = new ArrayList();
        int i =0, j =0;
        for(int k = 0; k<left.size()+right.size(); k++){
            if(left.get(i)<right.get(j)){
                comparisons++;
                list.add(left.get(i));
                i++;
            }
            else{
                list.add(right.get(j));
                j++;
            }
            if(i >= left.size()){
                comparisons++;
                list.addAll(right.subList(j, right.size()));
                k = list.size();
            }
            else if(j >= right.size()){
                list.addAll(left.subList(i, left.size()));
                k = list.size();
            }
        }
        return list;
    }

}