import java.util.Scanner;
//check the given number is leap year or not
class Leapyear {
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
       int year=s.nextInt();
      if(year%4==0 || year%400==0){
        System.out.println(year+"is a Leap year ");
        
      }
      else{
        System.out.println(year+"is not a leap year");
      }
    }
}