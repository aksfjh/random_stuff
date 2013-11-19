/*Write a class called "Square".  It should store the length of one side.
*   It should have two constructors, one that has no parameters and sets
*   the side length to one.  The other constructor should take one parameter
*   and set the side length to the parameter value.  The class should also
*   have a method call "getArea" that returns the area of the square.
*
*   Write a separate class called "TestSquare" that creates two squares,
*   one with each constructor, and prints the area of each.
*/
package ce2336hw11;

/**
 *
 * @author Daniel Heironimus
 */
public class TestSquare {

    public static void main(String args[]){

        Square a = new Square();
        Square b = new Square(5);
        System.out.println(a.getArea());
        System.out.println(b.getArea());
    }
}
