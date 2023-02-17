import java.util.*;

public class Leapyear 
{
   
  public static void leapyear()
  {
  
    Scanner s=new Scanner(System.in);
    System.out.println("enter the year:");
    int year=s.nextInt();
  if(((year%4==0) && (year%100!=0)) || year%400==0)
    {
       
      System.out.println(year+" year is a Leap year");
    }
    else{
  
      System.out.println(year+" year is not a leap year");
    }
  }
  public static void main(String args[]) 
  {
    System.out.println("LEAP YEAR CHECKER");
   Leapyear l=new Leapyear();
    l.leapyear();
    
    
  }
}
    
    
    
    