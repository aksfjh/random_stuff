/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package players;

/**
 *
 * @author aksfjh
 */
public class PrimeCalc {
    private int[] total;
    private int current;
    private boolean prime;
    public PrimeCalc()
    {}
    
    public int[] calc(int number)
    {
        total = new int[number];
        current = 1;
        for (int y = 0; y<number; y++)
        {
            total[y]=2;
        }
        for (int x = 2; current < number; x++)
        {
            prime = true;
            for(int z = 0; z < number; z++)
            {
                prime = (x%total[z]!=0);
            }
            if (prime)
            {
                total[current]=x;
                current++;
            }
            else{}
        }
        return total;
    }
}
