/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/
//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class PrimeNumbers 
{
  public static boolean primegenerator(int n) 
  {
  for (int i = 2; i <n; i++) 
    {
       if (n % i == 0) {
        return false;
       }
    }
    return true;
    }
 
  public static void display(int start,int end)
  {
    for(int i=start;i<=end;i++)
      {
        if(primegenerator(i))
        {
          System.out.println(i);
        }
      }
  }
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.print("enter starting Number:");
    int start=s.nextInt();
     System.out.print("enter ending Number:");
    int end=s.nextInt();
    display(start,end);
  }
}


//Add main method here

//Declare variables num1, num2, i, count and initialize count as zero

//Use the scanner class to provide input at execution time using scanner object
//Scanner s= new Scanner(System.in);

/*
Take start value as input and read using scanner object
System.out.print("Enter Starting Number : ");
int start = sc.nextInt();
*/

//Take end value as an input and read using scanner object

//check for all the integer numbers which is between the two numbers given, using for loop

/*Inside the loop, check if the number can be divided by other numbers. You will need another loop for this.
  If it is divisble by other numbers (except 1 and itself), then move on to check the next number
  Else, print the prime number and then move on to the next number
*/
 
     
