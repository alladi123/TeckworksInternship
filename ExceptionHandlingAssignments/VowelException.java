//Generate Custome exception if the person name not starting with Vowel
import java.util.*;
class Invalidname extends Exception {
    String message;
    public Invalidname(String message) {
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
    
public Person(String Person_name)
      {
        this.Person_name= Person_name;
      }
public void checkPersonname() throws Invalidname 
  {
    if(Person_name.charAt(0)=='a' && Person_name.charAt(0)=='e' && Person_name.charAt(0)=='i' && Person_name.charAt(0)=='o' && Person_name.charAt(0)=='u')
    {
      System.out.println("Person name is:"+Person_name);
      
    }
    else
    {       
throw new Invalidname("Person name is not started with vowel letter");
    }
        
    }
}
class  VowelException
  {
    public static void main(String[] args)
    {
      Person p=new Person("balu123");
      try 
        {
      p.checkPersonname();
        }
      catch (Invalidname e)
        {
            System.out.println("Error:" + e.get());
        }
     }
  }

