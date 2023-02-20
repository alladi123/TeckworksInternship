import java.util.*;
class Subtraction
  {
    public static void method(int a,int b)
    {
      if (a<b) 
      {
      for (int i=a;i>0;i--)
      {
        b--;
      }
      System.out.println("Subtraction of a and b is:"+b);
      }
      else{
      for(int i=b;i>0;i--)
      {
          a--;
      }
     System.out.println("Subtraction of a and b is:"+a);
      }
    }
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the numbers a and b:");
      int a=s.nextInt();
      int b=s.nextInt();
      Subtraction sub=new Subtraction();
      sub.method(a,b);
    }
  }