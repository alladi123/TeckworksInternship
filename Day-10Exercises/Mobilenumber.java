import java.util.*;

public class  Mobilenumber
{
  
   static  public  void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the mobile number:");
    String number=s.nextLine();
    if(number.length()==10 && number.length()>9)
    {
      System.out.println("given phone number is valid" +number);
    }
    else{
  System.out.println("given phone number is invalid " +number);
    }
    
  }
}