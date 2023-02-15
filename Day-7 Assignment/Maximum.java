import java.util.Scanner;
// find maximum number between two numbers
class Maximum
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
       int a=s.nextInt();
      int b=s.nextInt();
      int c=(a>b? a:b);
      System.out.println("maximum number is"+c);
    }
  }

    