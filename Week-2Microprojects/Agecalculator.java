import java.util.*;

public class Agecalculator {
  public static void main(String args[]) {
    System.out.println("Age Calculator Application");
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your Date of Birth year");
    int year = s.nextInt();
    
    Agecalculator a=new Agecalculator(); 
    a.calculator(year);
   
  }
  public static void calculator(int  year)
  {
    int presentyear = 2023;
     if (year > 0 && year < presentyear) {

      int finalage = presentyear - year;
      System.out.println("Your present age is" + finalage);
      if (finalage >= 18) {
        System.out.println("You are adult");
      } 
      else {
        System.out.println("You are minor");
      }
    } 
    else {
      System.out.println("Please enter valid year");
    }
  }
}
