/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ce2336hw11;

/**
 *
 * @author Daniel Heironimus
 */
public class Square {
    //declare variables
    private double side;
    //no-arg constructor, defaults side to 1
    Square(){
        side = 1;
    }
    //arg constructor
    Square(double val){
        side = val;
    }
    //method to calculate and return area of the square
    double getArea(){
        return side*side;
    }
}
