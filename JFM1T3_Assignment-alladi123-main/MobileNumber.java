//JFM1T3_Assignment4:
/*
1.Write a program to store your best friend's mobile number in a variable and print the last 4 digits. Consider the following sample for reference.
  Mobile number should accept only 10 digits. Not less than 10 digits or greater than 10 digits. 
  Allow user to input the phone number from the terminal

  Sample Input:
        mobileNum=9393927890

  Expected Output:
        Your friend's mobile number ends with ******7890

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class MobileNumber {
   static public void number(long phnumber) {
    int count = 0;
    long a;
     StringBuffer s1=new StringBuffer();
    System.out.println("last four digits are:");
    while (phnumber != 0) {
      a = phnumber % 10;
      phnumber = phnumber / 10;
      count++;
      if (count <= 4) {
        s1.append(a);
      
        }
    }
     s1.reverse();
      System.out.println("Your friend's mobile number ends with ******"+s1);
    
  }
  public static void main(String[] args) {
    long n;
    Scanner s = new Scanner(System.in);
    System.out.println("enter your best friend mobile number:");
    long phnumber = s.nextLong();
    MobileNumber f = new MobileNumber();
    f.number(phnumber);
  }
}
//Define the main method

//Declare the variable

//Use the scanner class to provide mobileNum at execution time

/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter phone number (10 digits)");
mobileNum = scanner.nextLine();
*/

//Verify if the mobile number is equal to 10 digits or not

//If the mobile number is equal to 10 digits then extract the last 4 digits else print error message

//Print the result
//System.out.println("Mobile number ends with ******"+variablename);

