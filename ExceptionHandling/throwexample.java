import java.util.*;
 
class throwexample {
  public static void main(String a[]) {
   int ATMpin=2342;
    try
      {
        //System.out.println(12/0);
        if(ATMpin!=1111)
         throw new Exception();
  // createing artithemtic exception object
      }
    catch(Exception w)
      {
      System.out.println("Invalid ATM pin no");
      }
  }
}
 