/*Create class Palindrome having methods add() and palindrome() to take data and verify whether the given number is palindrome or not. If the number is not palindrome generate a custom exception. Test your code for any 5 different numbers.
Use an array of objects for the test cases. */
import java.util.*;
class nonPlaindrome extends Exception
  {
    nonPalindrome(String message)
    {
      super(message);
    }
  }
class Palindrome
  {
    Scanner s=new Scanner(System.in);
    int number,sum=0,temp;
    void add()
    {
      System.out.println("enter the number");
      number=s.nextInt();
    }
    void checkpalindrome()
    {
      temp=number;
      while(number!=0)
        {
           r=number%10;  
         sum=(sum*10)+r;    
         number=number/10;    
        }
      try
        {
          if(sum!=temp)
          {
            throw new nonPlaindrome("number is not a palindrome");
          }
          else{
            System.out.println("number is a palindrome");
          }
        }
      catch(nonPlaindrome np)
        {
          System.out.println(np);
          checkpalindrome();
        }
    }
  }
class PalindromeMain
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(String.in);
      int testcases=s.nextInt();
      for(int i=0;i<=testcases;i++)
        {
          Palindrome p[]=new Palindrome[testcases];
          p[i].add();
          p[i].checkpalindrome();
        }
    }
  }