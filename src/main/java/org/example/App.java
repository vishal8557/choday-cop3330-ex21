package org.example;


 /*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Vishal Choday

Exercise 21 - Numbers to Names
        Many programs display information to the end user in one form but use a different form inside the program. For example, you may show the word Blue on the screen, but behind the scenes you’ll have a numerical value for that color or an internal value because you may need to represent the textual description in another language for Spanish-speaking visitors.

        Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number and display the corresponding calendar month, with 1 being January and 12 being December. For any value outside that range, display an appropriate error message.

        Example Output
        Please enter the number of the month: 3
        The name of the month is March.
        Constraints
        Use a switch or case statement for this program.
        Use a single output statement for this program.
*/
import java.util.Scanner;
public class App {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Please enter the number of the month: ");
  String putting_in_the_month = in.nextLine();
  String Name_of_the_month = null;


  int the_month = Integer.parseInt(putting_in_the_month);

  switch (the_month) {
   case 1:
    Name_of_the_month = "January";
    break;
   case 2:
    Name_of_the_month = "February";
    break;
   case 3:
    Name_of_the_month = "March";
    break;
   case 4:
    Name_of_the_month = "April";
    break;
   case 5:
    Name_of_the_month = "May";
    break;
   case 6:
    Name_of_the_month = "June";
    break;
   case 7:
    Name_of_the_month = "July";
    break;
   case 8:
    Name_of_the_month = "August";
    break;
   case 9:
    Name_of_the_month = "September";
    break;
   case 10:
    Name_of_the_month = "October";
    break;
   case 11:
    Name_of_the_month = "November";
    break;
   case 12:
    Name_of_the_month = "December";
    break;
   default:
    System.out.println("ERROR\nTRY AGAIN.");
  }
  if (Name_of_the_month != null) {
   System.out.printf ("The name of the month is %s.\n", Name_of_the_month);

  }
 }
}
