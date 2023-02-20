import java.util.Scanner;
// check the given number is divisible by 5 and 11
class Division
  {
    public static void division(int number)
    {
      if(number%5==0 && number%11==0)
      {
        System.out.println(number+"is divisible by 5 and 11");
      }
      else{
      System.out.println(number+"is  not divisible by 5 and 11");
      }
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
       int number=s.nextInt();
      Division d=new Division();
      d.division(number);
    }
  }