/* Write a class called "StudentReport".  Its main method has an array of strings with
*   this data:
*     String arr[] = { "Joe Smith, 101 Pine Street, 10/01/09",
*                      "Sue Walls, 506 Maple Street, 04-25-08",
*                      "Tim Jones, 909 West Mulberry Avenue, 03/20/10",
*                      "Sarah Mills, 1212 North Cedar, 08/10/11",
*                      "John K. Clements, 238 Apricot Lane, 06-17-07" };
*
*   Use string functions (refer to chapter 9) to print the information like this:
*       Smith, Pine Street, October 2009
*       Walls, Maple Street, April 2008
*       Jones, West Mulberry Avenue, March 2010
*       Mills, North Cedar, August 2011
*       Clements, Apricot Lane, June 2007
*/
package ce2336hw14;

/**
 *
 * @author Daniel Heironimus
 */
public class studentReport {
    public static void main(String[] args) {
        String arr[] = { "Joe Smith, 101 Pine Street, 10/01/09",
                      "Sue Walls, 506 Maple Street, 04-25-08",
                      "Tim Jones, 909 West Mulberry Avenue, 03/20/10",
                      "Sarah Mills, 1212 North Cedar, 08/10/11",
                      "John K. Clements, 238 Apricot Lane, 06-17-07" };
        for (int i=0; i<arr.length; i++){
            System.out.println(formatName(arr[i]) + ", " + formatAddress(arr[i]) + ", " + formatDate(arr[i]));
        }
    }
    //returns only the last name
    public static String formatName(String name){
        return name.split(",")[0].split(" ")[name.split(",")[0].split(" ").length-1];
    }
    //returns a string containing only the street name
    public static String formatAddress(String address){
        return address.split(",")[1].trim().substring(address.split(",")[1].trim().indexOf(" ")).trim();
    }
    //returns the month name and year, **too complicated to shrink into 1 line**
    public static String formatDate(String date){
        String months[] = {"January","February","March","April","May",
            "June","July","August","September","October","November","December"};
        String month = months[Integer.parseInt(date.split(",")[2].replaceAll("-","/").trim().split("/")[0])+1];
        String year = date.split(",")[2].replaceAll("-","/").trim().split("/")[2];
        return month + " 20" + year;
    }
}
