/*Write a class called "TestArrayList".  In its main method, create
 an ArrayList and add two Students and two OutofState_Students from
 the previous problem.  The students should be taking 10, 12, 15, and
 18 hours respectively.  In a loop, call the tuition calculation
 method of each one in the ArrayList to show the amount of tuition
 each student should pay.
 */

package ce2336hw32;

/**
 *
 * @author Daniel Heironimus
 */
public class TestArrayList {

    public static void main(String[] args) {
        java.util.ArrayList<Object> test = new java.util.ArrayList<Object>();
        test.add(new Student("Bob Hergam",10));
        test.add(new Student("Sven Perales",12));
        test.add(new OutofState_Student("Daniel Elander","Louisiana",15));
        test.add(new OutofState_Student("Mark Krugman","New Jersey",18));
        for(int i=0; i<test.size();i++){
            Object retrievedObject = test.get(i);
            if(retrievedObject.getClass().getName().contains("Student")){
                if(retrievedObject.getClass().getName().endsWith("OutofState_Student")){
                    String name = ((OutofState_Student)test.get(i)).getName();
                    float tuition = ((OutofState_Student)test.get(i)).calc_tuition();
                    System.out.println(name + " tuition is: $" + tuition +" (Out of state)");
                }else{
                    String name = ((Student)test.get(i)).getName();
                    float tuition = ((Student)test.get(i)).calc_tuition();
                    System.out.println(name + " tuition is: $" + tuition);

                }
            }
        }

    }
}
