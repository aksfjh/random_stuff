/*Create a "Student" class that has a name attribute and an attribute
 for the credit hours enrolled in for the current semester.  The class
 should have a method calc_tuition to calculate and return the tuition
 at the rate of $1000 per credit hour.  Derive a subclass called
 "OutofState_Student" that adds a string to contain an out-of-state
 location.  Override the calc_tuition method to pay $1500 per credit
 hour.  Be sure to add constructors and accessors/mutators as needed,
 as well as a toString method.
 */

package ce2336hw31;

/**
 *
 * @author Daniel Heironimus
 */
public class Student {
    //Variables
    private String name;
    private float credit_hours;
    //Constructors
    Student(){
        this("",0);
    }
    Student(String name){
        this(name, 0);
    }
    Student(String name, float credit_hours){
        this.name = name;
        this.credit_hours = credit_hours;
    }
    //Mutators and accessors
    public String getName(){
        return name;
    }
    public float getCreditHours(){
        return credit_hours;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCreditHours(float credit_hours){
        this.credit_hours = credit_hours;
    }
    //Special methods
    public float calc_tuition(){
        return credit_hours*1000;
    }
    //Override methods
    @Override public String toString(){
        return String.format("%s, %.3f", this.getName(),this.getCreditHours());
    }
}
