/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package players;
import java.util.List;
import java.util.Random;
/**
 *
 * @author aksfjh
 */
public class Tournament {
    private PlayerList participants;
    private PlayerList seeding;
    private int groups;
    public Tournament(PlayerList p)
    {
        participants = p;
    }

    private void NumberGroups()
    {
        int number = participants.playerTotal();
        if (number%4!=0)
            number += (number%4);
        groups = number/4;
    }
}
