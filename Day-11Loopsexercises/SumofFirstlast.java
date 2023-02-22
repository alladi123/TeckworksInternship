import java.util.*;
public class  SumofFirstlast
  {
    public static void count(int number)
    {
      int a=0,c=0,last=number%10;
      while(number!=0)
        {
          a=number%10;
          c++;
          number=number/10;
        }
System.out.println("sum of first and last numbers are:"+(a+last));
    }
  
public static void main(String[] a)
  {
  Scanner s=new Scanner(System.in);
      System.out.println("enter the number:");
      int number=s.nextInt();
      count(number);
  }
  }