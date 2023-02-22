import java.util.*;
public class  StrongNumber
  {
    public static int factorial(int a)
    {
      int f=1;
       while(a!=0)
            {
              f=f*a;
               a--;
            }
      return f;
    }
    public static void strong(int number)
    {
      int a,sum=0,t=number;
      while(number!=0)
        {
         a=number%10;
      sum=sum + factorial(a);
          number=number/10;
        }
  
      if(t==sum)
      {
        System.out.println(t+" "+"is a Strong number");
      }
      else{
        System.out.println(t+" "+ "is not a Strong number");
      }
    }
    public static void main(String[] a)
    {
       Scanner s=new Scanner(System.in);
      System.out.println("enter the number:");
      int number=s.nextInt();
      strong(number);
    }
  }
    