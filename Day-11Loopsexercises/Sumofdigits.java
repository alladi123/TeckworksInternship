import java.util.*;
public class  Sumofdigits
  {
    public static void sum(int number)
    {
      int a,c=0;
      while(number!=0)
        {
          a=number%10;
          c=c+a;
          number=number/10;
        }
      System.out.println("sum of digits is:"+c);
    }
  
public static void main(String[] a)
  {
  Scanner s=new Scanner(System.in);
      System.out.println("enter the number:");
      int number=s.nextInt();
      sum(number);
  }
  }