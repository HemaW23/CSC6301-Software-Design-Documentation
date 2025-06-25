//Name: Hema Willison
//Module 4 Assignment: Linked List and Collections Framework

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

 

public class SortedLinkedList {

   public static void main(String[] args) {

       Scanner input = new Scanner(System.in); //Reuse to handle user inputs rather than customer inputs//

       LinkedList<Integer> numbers = new LinkedList<>(); //Reuse for data storage, store integer inputs //

 
//reviewing the user input of entered integers//
       System.out.println("Enter a list of integers separated by spaces:");

       String[] inputIntegers = input.nextLine().split(" "); //Reuse to analyze the string inputs individually

 
//converting the strings to integers to add to the linked list// 
       for (String str : inputIntegers) {

           numbers.add(Integer.parseInt(str));

       }

 
//sorting the linked list in ascending order//
       Collections.sort(numbers); //Reuse for sorting the list rather//

 
//printing the sorted linked list//
       System.out.println("Sorted linked list: " + numbers);


   }
}