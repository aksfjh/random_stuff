/*
*   Write a class called "Point".  It should store an (x,y) position.  Its constructor
*   should set x and y.  It should have these methods:  getX, getY, setX, setY.  It
*   should also have a toString method that prints a Point like this:  (x,y)
 */

package ce2336hw22;

/**
 *
 * @author Daniel Heironimus
 */
public class Point {
    //create private variables
    private int x, y;
    //constructor
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    //accessor methods
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    //mutator methods
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    //overide for toString, (x,y)
    @Override public String toString(){
        return String.format("(%d,%d)", x, y);
    }
}
