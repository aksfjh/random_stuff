/*Create an interface called Audible.  Audible has one method named
 makeSound.

 Create a class called Mouse that implements Audible.  Its
 makeSound method prints "Squeek squeek".
 Create a class called Trombone that implements Audible.  Its
 makeSound method prints "Wah wah".
 Create a class called SportsCar that implements Audible.  Its
 makeSound method prints "Vroom vroom".

 Create a class called "TestSounds" that has a main method.  The
 main method should create one object of each class above.  Create
 an array of type Audible and place each object in the array.  In
 an enhanced for loop, call the makeSound method of each one.

 */

package ce2336hw34;

/**
 *
 * @author Daniel Heironimus
 */
public class TestSounds {
    public static void main(String[] args) {
        //create 3 objects
        Mouse mouse = new Mouse();
        SportsCar sportscar = new SportsCar();
        Trombone trombone = new Trombone();
        //create array and populate
        Audible[] test = new Audible[3];
        test[0] = mouse;
        test[1] = sportscar;
        test[2] = trombone;
        //enhanced for loop
        for(Audible aud : test){
            aud.makeSound();
        }
    }

}
