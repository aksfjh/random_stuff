/*
*   Write a class called "Quadrilateral".  It should store the length of
*   its four sides.  It should have three constructors:
*     a) receives four ints and sets all four sides
*     b) receives two ints, creates a parallelogram (opposite sides have equal length).
*     c) receives one int, sets all four sides to this length (a square).
*   Only the constructor that sets all four sides should set the instance variables.
*   The other constructors should call the four-parameter constructor using keyword "this".
*   Add a "toString" method to return a string like this:  [ side1, side2, side3, side4 ]
*
*   Write a separate class called "TestQuad".  Its main method creates 3 Quadrilaterals,
*   one with each constructor.  Print each object to show it worked correctly.
 */

package ce2336hw21;

/**
 *
 * @author Daniel Heironimus
 */
public class TestQuad {
    public static void main(String[] args) {
        //creates 3 quadrilaterals and prints the contents of each
        Quadrilateral irreg = new Quadrilateral(2,4,5,3);
        Quadrilateral para = new Quadrilateral(3,5);
        Quadrilateral sqr = new Quadrilateral(4);
        System.out.println(irreg);
        System.out.println(para);
        System.out.println(sqr);
    }

}
