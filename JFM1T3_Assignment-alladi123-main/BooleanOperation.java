//JFM1T3_Assignment5:
/*
1.Write a program to initialize a boolean variable and print it's opposite value on console.

  Sample Input:true

  Expected Output:false

*/
public class BooleanOperation {
   public static void  display(boolean a)
  {
  System.out.println(!a);
  }
public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the boolean value1:");
    boolean a=s.nextBoolean();
    
    display(a);
  }

//Define main method

//Declare a variable and initialize it as true or false 

//Print the Result using not operator 

}