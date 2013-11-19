/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package players;

/**
 *
 * @author aksfjh
 */
public class Player {
    private int rating;
    private String name;

    public Player(String Name)
    {
        this.name = Name;
        this.rating = 1000;
    }

    public Player(String Name, int Rating)
    {
        this.name = Name;
        this.rating = Rating;
    }
    public int getScore()
    {
        return this.rating;
    }
    public String getName()
    {
        return this.name;
    }
}
