/*
 * Write a generic class called Mailbox.  It should store one field
 * of the generic type called mail.  It should have a constructor
 * that sets the field.  It should also have an accessor and mutator.
 * Include a main method that creates two Mailbox objects, one of
 * String type and one of Date type.  Demonstrate the constructors,
 * accessors and mutators in both cases.
 */

package ce2336hw53;

import java.util.Date;
/**
 *
 * @author Daniel Heironimus
 */
public class MailboxTest {
    public static void main(String[] args) {
        //sets initial objects
        String message = "This is an example of accessor";
        String letter = "And this is an example of mutator+accessor";
        Date today = new Date();
        Date tomorrow = new Date();
        today.setTime(today.getTime());
        //sets tomorrow to today's time + 1 day of milliseconds
        tomorrow.setTime(tomorrow.getTime()+86400000);
        //constructs initial mailbox objects
        Mailbox<String> box1 = new Mailbox<String>(message);
        Mailbox<Date> box2 = new Mailbox<Date>(today);
        //accessor test
        System.out.println(box1.get());
        System.out.println(box2.get());
        //mutator test
        box1.set(letter);
        box2.set(tomorrow);
        System.out.println(box1.get());
        System.out.println(box2.get());
    }

}
