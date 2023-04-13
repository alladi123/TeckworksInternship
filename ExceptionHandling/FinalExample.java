import java.util.*;
class FinalExample
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      int y=s.nextInt();
      char[] c={'s','f','v'};
      try{
        System.out.println(x/y);
        System.out.println(c[7]);
        }
    catch(Exception q)//q is reference of type exception.
        {
          System.out.println(q);
        }
  System.out.println("program execution completed");
    }
  }