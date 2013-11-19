/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ce2336hw33;

/**
 *
 * @author Daniel Heironimus
 */
public class Knight extends ChessPiece {
    Knight(int x, int y){
        super(x,y);
    }
    //override for move

    @Override public boolean move(int newX, int newY){
        boolean valid = (Math.abs(super.row-newX)+Math.abs(super.column-newY)==3
                && Math.abs(Math.abs(super.row-newX)-Math.abs(super.column-newY))==1
                && newX >= 0 && newX < 8 && newY >= 0 && newY < 8);
        return valid;
    }
}
