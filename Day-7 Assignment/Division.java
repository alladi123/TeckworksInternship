import java.util.Scanner;
// check the given number is divisible by 5 and 11
class Division
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
       int a=s.nextInt();
      if(a%5==0 && a%11==0)
      {
        System.out.println(a+"is divisible by 5 and 11");
      }
      else{
        System.out.println(a+"is  not divisible by 5 and 11");
      }
    }
  }