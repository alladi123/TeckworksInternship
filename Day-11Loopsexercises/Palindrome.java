import java.util.*;
public class  Palindrome
  {
    public static void palindrome(int number)
    {
      int s,r=0,t=number;
      while(number>0)
        {
          s=number%10;
          r=r*10+s;
          number=number/10;
          }
      if(t==r)
      {
    System.out.println(t+ " "+"is Palindrome number");
      }
      else{
System.out.println(t+" "+ "is not a Palindrome number");
      }
    }



public static void main(String[] p)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number:");
      int number=s.nextInt();
      palindrome(number);
    }
  }