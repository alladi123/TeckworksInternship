import java.util.*;
public class Fibonacci
  {
    public static void fibonaccigenerator(int e,int f,int s)
    {
      for(int i=0;i<=e;i++)
        {
          System.out.println(f);
          int total=f+s;
          f=s;
          s=total;
        }
    }
  
public static void main(String[] a)
  {
  Scanner s=new Scanner(System.in);
    System.out.println("enter the limit:");
   int end_limit=s.nextInt();
    int first=0;
    int second=1;
    System.out.println("Fibonacci series are:");
    fibonaccigenerator(end_limit,first,second);
  }
}