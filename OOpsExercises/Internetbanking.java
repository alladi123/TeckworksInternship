import java.util.*;
class Internetbanking
  {
    static String username;
   static long password;
    String IFSCcode;
    Internetbanking(String u,long p,String Ifs)
    {
      username=u;
      password=p;
      IFSCcode=Ifs;
     System.out.println("your username is" +u);
    System.out.println("your password is" +p);
    System.out.println("your IFSC is" +Ifs);
    }
   
  void Verifyuser(String user,long passw)
    {
      if(username== user && password==passw)
    {
      System.out.println("valid user");
    }
    else
    {
     System.out.println("Invalid user");   
      }
    }
    
  }
class  Main
  {
    public static void main(String[] args)
    {
      Internetbanking i=new Internetbanking("balaji123",12345678,"ubin123");
        
      i.Verifyuser("balaji123",12345678);
     
    }
  }