class InvalidPassword extends Exception {
    String message;
    public InvalidPassword(String message) {
       this.message=message;
    
    }
   String get()
   {
     return message;
   }
}
class Password {
    private String Password1;
    
public Password(String Password1) {
        this.Password1= Password1;
      }
     
    public void checkPassword() throws InvalidPassword {
      int count=0;
       for(int i=0;i<=Password1.length()-1;i++)
         {
      if((Password1.charAt(i)>='A' && Password1.charAt(i)>='Z')|| (Password1.charAt(i)>='a' && Password1.charAt(i)<='z')|| (Password1.charAt(i)>='0' && Password1.charAt(i)<='9'))
           {
             count++;
           }
         }
         if(count!=Password1.length())
         {
            throw new InvalidPassword("Invalid password: " +Password1);
        }
           else{
             System.out.println("your password is:"+Password1);
           }
        
    }
}

class PasswordMain
  {
    public static void main(String[] args)
    {
      Password p=new Password("Balu123");
      try 
        {
      p.checkPassword();
        }
      catch (InvalidPassword e)
        {
            System.out.println("Error: " + e.get());
        }
     }
  }

