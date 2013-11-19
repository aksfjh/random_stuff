/*
 *    Create a class called TestQueue.  Its main method should create
 *    an array of 20 random integers from 0-99.  Create two queues
 *    using the GenQueue class.  Traverse the array and enqueue all
 *    even values into one queue and all odd values into the other
 *    queue.  Once this is done, then dequeue and print everything
 *    from the queue having odd values, and then the queue having
 *    even values.
 */

package ce2336hw63;

/**
 *
 * @author Daniel Heironimus
 */
public class TestQueue {
    public static void main(String[] args) {
        //GenQueue objects
        GenQueue<Integer> odds = new GenQueue<Integer>();
        GenQueue<Integer> evens = new GenQueue<Integer>();
        //rand and array related variables
        int arraysize = 20;
        int minrand = 0;
        int maxrand = 99;
        int nums[]= new int[arraysize];
        java.util.Random rand = 
                new java.util.Random(System.currentTimeMillis());
        //fills array up with random numbers from minrand to maxrand
        //(0-99 in this case), prints them as they are assigned
        System.out.println("Array of numbers[" + arraysize +"]:" );
        for(int i=0;i<arraysize;i++){
            nums[i]=rand.nextInt(maxrand+minrand+1)-minrand;
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
        //queues evens if value mod 2 is equal to 0, queues odds otherwise
        //note: this is split from the initializing step as interpreted in
        //the instructions
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
                evens.enqueue(nums[i]);
            else
                odds.enqueue(nums[i]);
        }
        //outputs the value of the value of the number
        //in the queue as it dequeues, odds first, then even
        System.out.println("\nOdds["+odds.getSize()+"]:");
        while(odds.getSize()>0){
            System.out.print(odds.dequeue()+ " ");
        }
        System.out.println("\nEvens["+ evens.getSize()+"]:");
        while(evens.getSize()>0){
            System.out.print(evens.dequeue()+ " ");
        }
        System.out.println();

        //alternate method of printing, vertical queues, side by side
        /*
        System.out.println(String.format("%s%8s", "Odds", "Evens"));
        while(odds.getSize()+evens.getSize()>0){
            String odd = "  ";
            String even = "  ";
            if(odds.getSize()>0)
                odd=odds.dequeue().toString();
                //System.out.print(String.format("%2d", odds.dequeue()));
            if(evens.getSize()>0)
                even=evens.dequeue().toString();
                //System.out.print(String.format("%10d", evens.dequeue()));
            System.out.println(String.format("%2s %6s",odd,even));
        }
        */
    }
}
