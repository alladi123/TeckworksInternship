import java.util.Scanner;
//Check the given number is even or odd
class EvenorOdd {
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
       int a=s.nextInt();
      if(a%2==0)
      {
        System.out.println(a+" is a even number");
      }
      else{
        System.out.println(a+" is a odd number");
      }
    }
}