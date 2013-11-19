/*
 * Contains basic information about food. Stores an expiration date,
 * name of food, and additional description. Also a way to check expiration
 * date with an outside date.
 */

package ce2336project;
import java.util.Date;
/**
 *
 * @author Daniel Heironimus
 */
public class Food {
    private String name, description;
    private Date expiration;

    //Constructors
    Food(String name, long expiration, String description){
        this.name = name;
        this.expiration = new Date(expiration);
        this.expiration.setHours(0);
        this.expiration.setMinutes(0);
        this.expiration.setSeconds(0);
        this.description = description;
        validateDescription();
    }
    Food(String name, Date expiration, String description){
        this(name, expiration.getTime(), description);
    }
    Food(String name){
        //expiration is defaulted to 3 days from creation
        this(name, System.currentTimeMillis()+259200, " ");
    }
    Food(String name, String description){
        //expiration is defaulted to 3 days from creation
        this(name, System.currentTimeMillis()+259200, description);
    }
    Food(String name, Date expiration){
        this(name, expiration, " ");
    }
    Food(String name, long expiration){
        this(name, expiration, " ");
    }
    Food(Food f){
        this(f.name,f.expiration,f.description);
    }

    //mutators
    public void setName(String name){
        this.name = name;
    }
    public void setExpiration(long expiration){
        this.expiration.setTime(expiration);
    }
    public void setExpiration(Date expiration){
        this.expiration.setTime(expiration.getTime());
    }
    public void setDescription(String description){
        this.description = description;
        validateDescription();
    }
    public void setAll(String name, Date expiration, String description){
        this.name = name;
        setExpiration(expiration);
        setDescription(description);
    }
    public void setAll(String name, long expiration, String description){
        this.name = name;
        setExpiration(expiration);
        setDescription(description);
    }

    //accessors
    public String getName(){
        return this.name;
    }
    //returns a new object with private variable information
    public Date getExpiration(){
        return new Date(expiration.getTime());
    }
    public String getDescription(){
        return this.description;
    }
    //returns a string of a user-friendly date
    public String stringExpiration(){
        return expiration.toLocaleString().
                split("[0-1][0-9][:]|[0-9][:]")[0].trim();
    }

    //methods
    //checks the expiration date of the food
    public boolean checkExpiration(Date some_date){
        return expiration.before(some_date);
    }
    public boolean checkExpiration(long some_date){
        return expiration.getTime()<some_date;
    }
    //makes sure Description isn't an empty string
    private void validateDescription(){
        if(this.description.length()==0)
            this.description.concat(" ");
    }

    //overrides
    @Override
    public String toString(){
        return name + ", Expires: " +
                expiration.toLocaleString().
                split("[0-1][0-9][:]|[0-9][:]")[0].trim()
                + ", Description: " +description;
    }
}
