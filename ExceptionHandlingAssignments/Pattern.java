/*Generate Custome exception if the given password is not equal to "abc123"*/
import java.util.*;
 class InvalidPasswordException extends Exception 
{
      String message;
    public InvalidPasswordException(String message) 
      {
        this.message=message;
      }
      
   String get()
   {
     return message;
   }
}
class Pattern1
{
     String Password;
    
public Pattern1(String Password) 
      {
        this.Password= Password;
      }
void checkpassword() throws InvalidPasswordException
  {
    
     if (!Password.equals("abc123")) 
      {
    throw new InvalidPasswordException("Invalid password.");
      } 
     else 
     {
    System.out.println("Login successful!");
     }
  }
  }
public class Pattern 
{
    public static void main(String[] args) 
  {
        Pattern1 obj= new Pattern1("abc123");
    try {
            obj.checkpassword();
        } 
    catch (InvalidPasswordException e) {
            System.out.println("Error: " + e.get());
        }
    }
}