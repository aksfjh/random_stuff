/* A famous story claims the inventor of the chessboard was granted a wish by the
*  king, and he asked the king to pay him 1 grain of rice for the first square,
*  2 for the second square, 4 for the third, and so on, doubling with each square.
*  There are 64 squares.  Use BigInteger to calculate how many grains of rice he
*  would receive.
*/

package ce2336hw24;
import java.math.BigInteger;
/**
 *
 * @author Daniel Heironimus
 */
public class TestBigInt {
    public static void main(String[] args) {
        //create the 2 BigInteger objects, rice for total and
        //squareValue for increment
        BigInteger rice = new BigInteger("0");
        BigInteger squareValue = new BigInteger("1");
        //adds the current increment value that doubles each square
        //to the total rice value, then increments the value by doubling it
        for(int i = 0; i<=64;i++){
            rice = rice.add(squareValue);
            squareValue = squareValue.multiply(BigInteger.valueOf(2));
        }
        //outputs the result
        System.out.println("He will recieve "+rice+" grains of rice.");
    }

}
