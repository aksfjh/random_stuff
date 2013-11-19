/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package players;

/**
 *
 * @author aksfjh
 */
public class Match {
    private Player one;
    private Player two;
    private boolean winner;
    
    public Match(Player one, Player two, boolean winner)
    {
        this.one = one;
        this.two = two;
        this.winner = winner;
    }
}
