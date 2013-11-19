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

//Subclass of Student
public class OutofState_Student extends Student {
    //Variables
    private String state;
    //Constructors
    OutofState_Student(String name, String state, float hours){
        super(name, hours);
        this.state = state;
    }
    OutofState_Student(String name, String state){
        this(name,state,0);
    }
    OutofState_Student(){
        this("","",0);
    }
    //Mutators and accessors
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return this.state;
    }
    //Override methods
    @Override public float calc_tuition(){
        return this.getCreditHours()*1500;
    }
    @Override public String toString(){
        return String.format("%s, %.3f (Out of state: %s)", super.getName(),super.getCreditHours(),this.state);
    }
}
