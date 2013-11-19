/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ce2336hw34;

/**
 *
 * @author Daniel Heironimus
 */
public class SportsCar implements Audible{
    //override Audible method
    @Override public void makeSound(){
        System.out.println("Vroom vroom");
    }
}
