import java.util.Scanner;
//Check the given number is even or odd
class EvenorOdd {
  public static void check(int number)
  {
     if(number%2==0)
      {
        System.out.println(number+" is a even number");
      }
      else{
        System.out.println(number+" is a odd number");
      }
  }
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
       int number=s.nextInt();
     EvenorOdd e=new EvenorOdd();
      e.check(number);
    }
}