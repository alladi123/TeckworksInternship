import java.util.Scanner;
// print different data types
class Datatypes
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      String y=s.next();
      char y1=s.next().charAt(1);
      double z=s.nextDouble();
      long z1=s.nextLong();
      float f=s.nextFloat();
      byte b=s.nextByte();
      
      System.out.println("x value is"+x);
       System.out.println("y string is"+y);
       System.out.println("z value is"+z);
       System.out.println("y1 value is"+y1);
       System.out.println("z value is"+z);
       System.out.println("z1 value is"+z1);
       System.out.println("f value is"+f);
       System.out.println("b value is"+b);
      
      
      
      
    }
  }