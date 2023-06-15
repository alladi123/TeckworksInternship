/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;

public class Temperature{
  public static void display( double a, double b, double c)
  {
    if(a<b && a<c)
    {
System.out.println("The lowest temperature of the week 1 is"+a+" "+"celsius");
    }
    else if(b<a && b<c)
    {
      System.out.println("The lowest temperature of the week 2 is"+b+" "+"celsius");
    }
    else{
      System.out.println("The lowest temperature of the week 3 is"+c+" "+"celsius");
    }
  }

//Define the main method

//Declare the variables and initialize

//Take temperature of 7 days as a input from user

//Calculate the lowest temperature

//Print the result
public static void main(String[] ar)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number of days:");
    int n=s.nextInt();
    System.out.println("Enter the temperature of Day :1");
    double a=s.nextInt();
    System.out.println("Enter the temperature of Day :2");
    double b=s.nextInt();
    System.out.println("Enter the temperature of Day :3");
    double c=s.nextInt();
    display(a,b,c);
  }
}