/* Write a class called "ListBooks".  In its main method, it creates an array of 6 books
*   using an initializer list.  For example, this creates an array of two books:
*     Book list[] = { new Book( "Harry Potter",  "J.K. Rowling", 320),
*                     new Book( "Calico Joe",  "John Grisham", 208) };
*   Write a method called "sortBooks" that receives an array of Books and sorts them
*   by title.  Write another method called printBooks that receives an array of Books
*   and prints each Book as shown in problem 2.
*/

package ce2336hw13;
/**
 *
 * @author Daniel Heironimus
 */
public class ListBooks {

    public static void main(String[] args) {
        Book list[] = {new Book("Book 2", "Author 2", 123),
            new Book("Book 3", "Author 3", 123),
            new Book("Book 1", "Author 1", 123),
            new Book("Book 4", "Author 4", 123),
            new Book("Book 5", "Author 5", 123),
            new Book("Book 6", "Author 6", 123)};
        sortBooks(list);
        printBooks(list);
    }
    //Bubble sort, checks adjacent array elements and swaps them if they are out of order,
    //continues until there is a pass without a swap.
    public static void sortBooks(Book newList[]){
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        Book temp = new Book();   //holding variable

        while (flag)
        {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < newList.length-1;  j++ ){
                if (newList[j].getTitle().compareToIgnoreCase(newList[j+1].getTitle())>0){   //compares strings, swaps alphabetical order
                        temp = newList[j];                //swap elements
                        newList[j] = newList[j+1];
                        newList[j+1] = temp;
                        flag = true;              //shows a swap occurred
                }
            }
        }
    }

    //adapts the printBook method to an array
    public static void printBooks(Book newList[]){
        for (int i=0; i<newList.length; i++){
            newList[i].printBook();
        }
    }
}
