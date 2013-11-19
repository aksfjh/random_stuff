/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ce2336hw21;

/**
 *
 * @author Daniel Heironimus
 */
public class Quadrilateral {
    //declare variables, one for each side
    private int side1, side2, side3, side4;
    //constructor for any quadrilateral
    Quadrilateral (int side1, int side2, int side3, int side4){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }
    //constructor for parallelogram
    Quadrilateral(int side1, int side2){
        this(side1, side2, side1, side2);
    }
    //constructor for square
    Quadrilateral(int side){
        this(side,side,side,side);
    }
    //toString override
    @Override public String toString(){
        return String.format("[ %d, %d, %d, %d ]", side1, side2, side3, side4);
    }
}
