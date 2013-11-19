/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ce2336project;
import java.util.ArrayList;
/**
 *
 * @author aksfjh
 */
public class Refrigerator {
    private ArrayList<Food> food = new ArrayList<Food>();
    
    //mutators
    public void addItem(Food item){
        food.add(item);
    }
    public void addItem(int index,Food item){
        food.add(index, item);
    }
    public void replaceItem(int index, Food item){
        food.set(index, item);
    }
    public boolean removeItem(Food item){
        for(int i=0;i<food.size();i++){
            if(item.getName().equalsIgnoreCase(food.get(i).getName())){
                if(item.getExpiration().getTime()==
                        food.get(i).getExpiration().getTime()){
                    food.remove(i);
                    return true;
                }
            }
        }
        return false;
    }
    public boolean removeItem(int index){
        if(index<food.size()){
            food.remove(index);
            return true;
        }
        else return false;
    }

    //accessors
    public ArrayList<Food> getList(){
        return new ArrayList<Food>(this.food);
    }
    public Food getFood(int index){
        return new Food(food.get(index).getName(),
                food.get(index).getExpiration(),
                food.get(index).getDescription());
    }
}
