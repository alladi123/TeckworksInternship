//Generate Custome exception if the ATM pin number is not equal to 0000
import java.util.*;
class InvalidAtmpin extends Exception {
    String message;
    public InvalidAtmpin(String message) {
       this.message=message;
    }
   String get()
   {
     return message;
   }
}
class Person
{
    int number;
    
public Person(int number) {
        this.number=number;
      }
     
    public void checkAtmpin() throws InvalidAtmpin {
    if(number==0000)
    {
      System.out.println("Person name is:"+number);
    }
    else
    {       
throw new InvalidAtmpin("ATM number  is not started with 0000");
    }
        
    }
}
class Uppercaseletter
  {
    public static void main(String[] args)
    {
      Person p=new Person(1234);
      try 
        {
      p.checkPersonname();
        }
      catch (InvalidUppercase e)
        {
            System.out.println("Error: " + e.get());
        }
     }
  }

