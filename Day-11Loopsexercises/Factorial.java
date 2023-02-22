import java.util.*;
public class Factorial
  {
    public static void factorial(int number)
    {
    int f=1,i=1;
    while(i<=number)
    {
    f=f*number;
      number--;
    }
    System.out.println("Factorial of a number is:"+f);
    }
    public static void main(String[] p)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number:");
      int number=s.nextInt();
      factorial(number);
    }
  }