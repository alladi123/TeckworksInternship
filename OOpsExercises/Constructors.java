import java.util.*;
class Constructors
  {
    int n1;
    int n2;
    Constructors(int a,String b)
    {
      System.out.println(a+""+b);
    }
    void getn1()
    {
    System.out.println(n1);
    }
  void getn2()
    {
      System.out.println(n2);
    }
    void setn1()
    {
      Scanner s=new Scanner(System.in);
      n1=s.nextInt();
    }
    void setn2()
    {
     Scanner s=new Scanner(System.in);
      n2=s.nextInt();
    }
  }
  class Main
    {
      public static void main(String[] ar)
      {
        Constructors c=new Constructors(56,"hi");
  //Constructors c1=new Constructors(52);
         c.setn1();
        c.setn2();
        c.getn1();
        c.getn2();
       
      }
    }
    
  