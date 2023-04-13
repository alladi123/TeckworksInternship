//Generate Custome exception if the mobile number not having total 10 digits
import java.util.*;
class Invalidmobilenumber extends Exception {
    String message;
    public Invalidmobilenumber(String message) {
       this.message=message;
    }
   String get()
   {
     return message;
   }
}
class Phonenumber
{
    long phone_number;
    
public Phonenumber(long phone_number) {
        this.phone_number=phone_number;
      }
     
    public void checkmobilenumber() throws Invalidmobilenumber {
      int count=0;
      long t=phone_number;
    while(phone_number>0)
    {
      phone_number=phone_number/10;
      count++;
    }
      if(count==10)
      {
        System.out.println("your mobile number is:"+t);
      }
    else
    {       
     throw new Invalidmobilenumber("your mobile number not having total 10 digits");
    }
        
    }
}
class Mobilenumber
  {
    public static void main(String[] args)
    {
      Phonenumber p=new Phonenumber(1234567890);
      try 
        {
      p.checkmobilenumber();
        }
      catch (Invalidmobilenumber e)
        {
            System.out.println("Error: " + e.get());
        }
     }
  }

