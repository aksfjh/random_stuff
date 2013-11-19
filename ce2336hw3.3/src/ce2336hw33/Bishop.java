/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ce2336hw33;

/**
 *
 * @author Daniel Heironimus
 */
public class Bishop extends ChessPiece{
    Bishop(int x, int y){
        super(x,y);
    }
    //override for move
    @Override public boolean move(int newX, int newY){
        boolean valid = ((super.row+super.column == newX+newY
                || super.row-super.column == newX-newY)
                && newX >=0 && newX <8 && newY >=0 && newY <8);
        return valid;
    }
}
