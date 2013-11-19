/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ce2336hw23;

/**
 *
 * @author Daniel Heironimus
 */
public class Line {
    Point point1, point2;
    //constructors, first takes 4 xy magnitudes, other takes 2 points
    Line(int x1, int y1, int x2, int y2){
        point1 = new Point(x1,y1);
        point2 = new Point(x2,y2);
    }
    Line(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }
    //returns the distance as a double
    //answer = sqrt((x1-x2)^2 + (y1-y2)^2)
    public double distance(){
        return Math.sqrt(Math.pow(point1.getX()-point2.getX(),2)+Math.pow(point1.getY()-point2.getY(),2));
    }
    //toString override, (x,y) to (x,y)
    @Override public String toString(){
        return String.format("%s to %s", point1, point2);
    }

}
