import java.util.Scanner;
// find maximum number between two numbers
class Maximum
  {
    public static void show(int number1,int number2)
    {
       int c=(number1>number2? a:b);
      System.out.println("maximum number is"+c);
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number1 and number2:");
       int number1=s.nextInt();
      int number2=s.nextInt();
     Maximum m=new Maximum();
      m.show(number1,number2);
    }
  }

    