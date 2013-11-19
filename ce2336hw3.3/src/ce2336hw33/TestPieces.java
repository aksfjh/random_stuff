
/*Create an abstract ChessPiece class.  A chess piece has attributes
 of name and its row and column on the board.  It also has an
 abstract method called move that receives the row and column of the
 new position.

 Derive three subclasses:  Knight, Bishop, and King.

 A bishop can only move diagonally.  A knight can move 2 spaces
 vertically or horizontally, then one more to either side.  A king
 can move one space in any direction.

 Each subclass should implement the move method to check for a valid
 move.  If the move is valid, the move method returns true, and
 returns false if invalid.  The move must also stay within the 8x8
 board.  Board positions range from (0,0) to (7,7).

 Create a class called "TestPieces" that has a main method.  The
 main method should create one of each piece with an initial board
 position of (3,3).  Create an array of type ChessPiece and place
 each object in the array.  In an enhanced for loop, print the
 result of moving each piece to (4,4), (5,5), and (5,2).
 */
package ce2336hw33;

/**
 *
 * @author Daniel Heironimus
 */
public class TestPieces {
    public static void main(String[] args) {
        //create array and populate with new objects
        ChessPiece[] test = new ChessPiece[3];
        test[0] = new Bishop(3,3);
        test[1] = new Knight(3,3);
        test[2] = new King(3,3);
        //enhanced for loop
        for(ChessPiece piece : test){
            //identifier
            System.out.println(piece.getClass().toString());
            //attempt moves
            System.out.println(piece.move(4,4));
            System.out.println(piece.move(5,5));
            System.out.println(piece.move(5,2));
        }
    }

}
