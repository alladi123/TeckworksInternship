import java.util.*;
class Swapping
  {
    public static void method(int a,int b)
    {
      a=a+b;
      b=a-b;
      a=a-b;
System.out.println("After swapping values of a and b:"+a +" "+b);
    }
  public static void main(String[] args)
    {
      System.out.println("enter the values of a and b:");
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      System.out.println("before swapping values of a and b :"+a +" "+b);
      Swapping s1=new Swapping();
      s1.method(a,b);
    }
  }