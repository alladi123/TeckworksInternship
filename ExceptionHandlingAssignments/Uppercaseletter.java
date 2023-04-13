/*Generate Custome exception if the person name not started with Upper Case letter*/
import java.util.*;
class InvalidUppercase extends Exception {
    String message;
    public InvalidUppercase(String message) {
       this.message=message;
    }
   String get()
   {
     return message;
   }
}
class Person
{
     String Person_name;
    
public Person(String Person_name) {
        this.Person_name= Person_name;
      }
     
    public void checkPersonname() throws InvalidUppercase {
    if(Person_name.charAt(0)>='A' && Person_name.charAt(0)<='Z')
    {
      System.out.println("Person name is:"+Person_name);
      
    }
    else
    {       
throw new InvalidUppercase("Person name is not started with uppercase letter");
    }
        
    }
}
class Uppercaseletter
  {
    public static void main(String[] args)
    {
      Person p=new Person("alu123");
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

