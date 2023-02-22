import java.util.*;
public class  ArmstrongbwRange
  {
    public static void armstrong(int number)
    {
      
      System.out.println("Armstrong numbers are:");
      for(int i=1;i<=number;i++)
        {
          int t=i, s,r=0;
       while(t>0)
        {
          s=t%10;
          r=r+(s*s*s);
          t=t/10;
          }
        if(i==r)
         {
           System.out.println(i);
         }
        }
     
    }



public static void main(String[] p)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number:");
      int number=s.nextInt();
      armstrong(number);
    }
  }