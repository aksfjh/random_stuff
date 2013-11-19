/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package players;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author aksfjh
 */
public class PlayerList {
    private ArrayList players;

    public PlayerList()
    {
    }
    public PlayerList(Player player)
    {
        players.add(player);
    }
    public void addPlayer(Player P)
    {
        players.add(P);
    }
    public void remPlayer(Player P)
    {
        players.remove(P);
    }
    public int playerTotal()
    {
        return players.size();
    }
}
