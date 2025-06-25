//Name: Hema Willison
//Module 5 Assignment: Planning and Executing a Maintenance Task

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/** Name: Hema Willison
 * Mod 5 Assignnment 
 * The reuse information is found within the code as well as the maintenance task changes.
 * The SortedStack class demonstrates reading user input, storing the input in a Stack, sorting the elements,and printing them in ascending order.
 * Scanner is used to handle the user's input. 
 * Stack is used as data storage to store the integers. 
 * Collections is used to sort the list. 
 * Lastly, the sorted list is printed for the user to view. 
  */

 

public class SortedStack { //changed from LinkedList to SortedStack//

   public static void main(String[] args) {

       Scanner input = new Scanner(System.in); //Reuse to handle user inputs rather than custom inputs//

       Stack<Integer> numbers = new Stack<>(); //changed from LinkedList to Stack//
       //Reuse for data storage, store integer inputs //

 
//reviewing the user input of entered integers//
       System.out.println("Enter a list of integers separated by spaces:");

       String[] inputIntegers = input.nextLine().split(" "); //Reuse to analyze the string inputs individually

 
//converting the strings to integers to add to the stack// 
       for (String str : inputIntegers) {

           numbers.add(Integer.parseInt(str));

       }

 
//Sorting the stack in ascending order//
       Collections.sort(numbers); //Reuse for sorting the list//

 
//Printing the sorted stack list//
       System.out.println("Sorted stack: " + numbers); //changed from Linked List to Sorted Stack//


   }
}