import java.util.*;
class ATM
  {
    long account_number;
    long balance;
    String accountholder_name;
    static long deposit_amount=3000;
    ATM(long a,long b,String c)
    {
      static int withdraw;
      
      account_number=a;
      balance=b;
      accountholder_name=c;
      System.out.println(a+" "+b+" "+c);
       System.out.println(deposit_amount);
    }
    
  }
class Account
  {
    public static void main(String[] ar)
    {
      ATM ac=new ATM(740210212,500000,"Balaji");
 
    }
  }