/*
 * Write a generic class called Mailbox.  It should store one field
 * of the generic type called mail.  It should have a constructor
 * that sets the field.  It should also have an accessor and mutator.
 * Include a main method that creates two Mailbox objects, one of
 * String type and one of Date type.  Demonstrate the constructors,
 * accessors and mutators in both cases.
 */

package ce2336hw53;

/**
 *
 * @author Daniel Heironimus
 */
public class Mailbox<mail> {
    //generic variable
    mail payload;
    //constructor
    Mailbox(mail payload){
        this.payload = payload;
    }
    //accessor
    public Object get(){
        return payload;
    }
    //mutator
    public void set(mail payload){
        this.payload = payload;
    }
}
