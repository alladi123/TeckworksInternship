import java.util.*;
class  SumofDigits
  {
    public static void Sum(long l)
    {
      int sum=0;
      while(l!=0)
        {
          int a=l%1000;
         
          sum+=a;
           l=l/100;
        }
      System.out.println(sum);
    }
public static void main(String[] r)
    {
Scanner s=new Scanner(System.in);
      System.out.println("enter the number:");
     long number=s.nextLong();
    Sum(number);
    }
}