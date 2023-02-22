import java.util.*;
public class  Armstrong
  {
    public static void armstrong(int number)
    {
      int s,r=0,t=number;
      while(number>0)
        {
          s=number%10;
          r=r+(s*s*s);
          number=number/10;
          }
      if(t==r)
      {
    System.out.println(t+ " "+"is Armstrong number");
      }
      else{
System.out.println(t+" "+ "is not an Armstrong number");
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