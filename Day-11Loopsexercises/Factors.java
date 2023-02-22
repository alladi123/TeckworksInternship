import java.util.*;
public class Factors
  {
    public static void factors(int number)
    {
      
      for(int i=1;i<=number;i++)
        {
          if(number%i==0)
          {
            System.out.print(i +"");
          }
        }
    }
  public static void main(String[] a)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number:");
      int number=s.nextInt();
      factors(number);
      
    }
  }