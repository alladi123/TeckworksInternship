import java.util.*;
class Addwithoutsign
  {
    public static void method(int a,int b){
    
      for (int i=b;i>0;i--)
      {
        a++;
      }
      System.out.println("Addition of a and b is:"+a);
      }
      public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the numbers a and b:");
      int a=s.nextInt();
      int b=s.nextInt();
      Addwithoutsign add=new Addwithoutsign();
      add.method(a,b);
    }
  }