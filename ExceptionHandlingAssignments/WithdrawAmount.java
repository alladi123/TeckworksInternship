//Generate Custome exception if the given withdraw amount is not a number
import java.util.*;
class InvalidAmount extends Exception {
    String message;
    public InvalidAmount(String message) {
       this.message=message;
    }
   String get()
   {
     return message;
   }
}
class withdrawl
{
    long withdrawAmount;
    
public Phonenumber(long withdrawAmount) {
        this.withdrawAmount=withdrawAmount;
      }
  public void checkAmount() throws InvalidAmount 
    {
      
        System.out.println("your mobile number is:"+t);
    }    
     throw new InvalidAmount("your mobile number not having total 10 digits");
    }
        
    }
}
class Mobilenumber
  {
    public static void main(String[] args)
    {
      Phonenumber p=new Phonenumber(1);
      try 
        {
      p.checkmobilenumber();
        }
      catch (InvalidAmount e)
        {
            System.out.println("Error: " + e.get());
        }
     }
  }

