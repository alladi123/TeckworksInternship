import java.util.*;
class Squareroot
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      int number=s.nextInt();
    
      try
        {
        
          System.out.println(Math.sqrt(number));
        }
        catch(Exception a)
        {
          System.out.println(a);
        }
          
      System.out.println("execution completed");
      
    }
  }