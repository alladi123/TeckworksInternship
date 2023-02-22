import java.util.*;
public class PowerofNumber
  {
    public static void power(int b,int p)
    {
      int r=1;
      while(p!=0)
        {
        r=r*b;
         p--; 
        }
System.out.print("Power of a number is:"+r);
    }

    
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.print("enter the base value:");
      int base =s.nextInt();
      System.out.print("enter the power value:");
      int power=s.nextInt();
      power(base,power);
    }
  }