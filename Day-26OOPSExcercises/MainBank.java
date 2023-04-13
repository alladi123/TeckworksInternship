
/*All the banks operating in India are controlled by RBI. RBI has set well-defined guidelines (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) that all banks must follow. For example, suppose RBI has set the minimum interest rate applicable to a savings bank account to be 4% annually; however, banks are free to use a 4% interest rate or to set any rates above it.*/
/*Write a Java program to implement bank functionality in the above scenario and demonstrate the dynamic polymorphism concept. Note: Create a few classes namely Customer, Account, RBI (Base Class), and a few derived classes (SBI, ICICI, PNB, etc). Assume and implement required member variables and functions in each class.*/
import java.util.*;
class RBI 
{
 public void display(String s1) {
    if(s1 == "Savings") {
      System.out.println("valid account");
    } 
    else 
    {
      System.out.println("invalid account");
    }

  }

  public void interest(int minimum_interest, long balance_allow) {

    if (balance_allow > 20000) {
      double total = balance_allow + minimum_interest;
    } else {
      System.out.println("no interest");
    }
  }

  public void with_draw(long withdrawl_limit) {
    if (withdrawl_limit <= 50000) {
      System.out.println("proceed");
    } else {
      System.out.println("please enter valid cash");
    }
  }
}

class customer extends RBI {
  public void show() {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the customer name:");
    String name = s.next();
    System.out.println("enter the customer number:");
    long acc_num = s.nextLong();
  }

}

class Account extends RBI {
  String account;

  public void account() {
    Scanner s = new Scanner(System.in);
    account = s.next();
  }

  public void acc_type() {
    if (account == "Savings") {
      double intersest = 0.04;
    }
  }
}

class SBI extends RBI {
  public void display(String s1) {
    if (s1 == "Savings") {
      System.out.println("valid account");
    } else {
      System.out.println("invalid account");
    }
  }

  public void interest(int minimum_interest, long balance_allow) {

    if (balance_allow > 20000) {
      double total = balance_allow + minimum_interest;
    } else {
      System.out.println("no interest");
    }

  }

  public void with_draw(long withdrawl_limit) {
    if (withdrawl_limit <= 50000) {
      System.out.println("proceed");
    } 
  else
    {
      System.out.println("please enter valid cash");
    }
  }
}
class ICICI extends RBI {
  public void display(String s1) {
    if (s1 == "Savings") {
      System.out.println("valid account");
    } else {
      System.out.println("invalid account");
    }
  }

  public void interest(int minimum_interest, long balance_allow) {

    if (balance_allow > 20000) {
      double total = balance_allow + minimum_interest;
    } else {
      System.out.println("no interest");
    }

  }

  public void with_draw(long withdrawl_limit) {
    if (withdrawl_limit <= 50000) {
      System.out.println("proceed");
    } 
    else
    {
      System.out.println("please enter valid cash");
    }
  }
}
class PNB extends RBI {
  public void display(String s1) {
    if (s1 == "Savings") {
      System.out.println("valid account");
    } else {
      System.out.println("invalid account");
    }
  }

  public void interest(int minimum_interest, long balance_allow) {

    if (balance_allow > 20000) {
      double total = balance_allow + minimum_interest;
    } else {
      System.out.println("no interest");
    }

  }

  public void with_draw(long withdrawl_limit) {
    if (withdrawl_limit <= 50000) {
      System.out.println("proceed");
    } else {
      System.out.println("please enter valid cash");
    }
  }
}

class MainBank {
  public static void main(String[] args) {
    RBI rb = new RBI();
    customer c = new customer();
    Scanner s = new Scanner(System.in);
    System.out.println("enter the bank type:");
    String s1 = new String(s.next());
    System.out.println("enter the minimum interest of RBI");
    int minimum_interest = s.nextInt();
System.out.println("enter the minimum balance allowed of RBI");
    long balance_allow = s.nextLong();
    System.out.println("enter minimumwithdrawl limit:");
    long withdrawl_limit = s.nextLong();

    rb.display(s1);
    rb.with_draw(withdrawl_limit);
    rb.interest(minimum_interest, balance_allow);
    c.show();

  }
}