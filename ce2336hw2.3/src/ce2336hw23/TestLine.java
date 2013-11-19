/*
*   Write a class called "Line".  It should store two Point objects.  It should have two
*   constructors, one that receives 4 ints to set the (x,y) of each end, and the other
*   that receives two Point objects.
*
*   It should have a distance method that computes the length of the line.  Its toString
*   method should print like this:  (x,y) to (x,y)
*
*   Write a main method that creates a line with each constructor.  It should then print
*   each line and its length.
 */


package ce2336hw23;

/**
 *
 * @author Daniel Heironimus
 */
public class TestLine {
    public static void main(String[] args) {
        //create 2 points for the first constructor
        Point point1 = new Point(12,3);
        Point point2 = new Point(7,7);
        //create 2 lines, one from 2 points, other from 4 integers
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(23,-4,-8,0);
        //output line segments and their lengths
        System.out.println(line1);
        System.out.println("The length is: " + line1.distance());
        System.out.println(line2);
        System.out.println("The length is: " + line2.distance());
    }

}
