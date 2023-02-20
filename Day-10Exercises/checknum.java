import java.util.Scanner;
// check given number is positive or negative or zero
class Checknum {
  public static void check(int number)
  {
     if(number>0){
        System.out.println(number+"is positive number");
      }
      else if(a==0)
        {
         System.out.println(number+"is a zero");
      }
      else{
         System.out.println(number+"is negative  number");
      }
  }
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
       int number=s.nextInt();
      Checknum c=new Checknum();
      c.check(number);
     
        
      }
      }