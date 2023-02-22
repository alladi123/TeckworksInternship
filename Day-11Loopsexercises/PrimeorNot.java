import java.util.*;
public class PrimeorNot
  {
    public static void prime(int number)
    {
     int c=0,t=number;
      for(int i=1;i<=number;i++)
        {
          if(number%i==0)
          {
            c++;
          }
        }
      if(c>2)
      {
        System.out.println(t+" "+"is not a prime number");
      }
      else{
        System.out.println(t+" "+"is a prime number");
      }
    }

public static void main(String[] p)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number:");
      int number=s.nextInt();
      prime(number);
    }
  }