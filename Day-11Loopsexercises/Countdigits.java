import java.util.*;
public class  Countdigits
  {
    public static void count(int number)
    {
      int a,c=0;
      while(number!=0)
        {
          a=number%10;
          c++;
          number=number/10;
        }
      System.out.println("display number of digits is:"+c);
    }
  
public static void main(String[] a)
  {
  Scanner s=new Scanner(System.in);
      System.out.println("enter the number:");
      int number=s.nextInt();
      count(number);
  }
  }