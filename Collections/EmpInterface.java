import java.util.*;

interface Employee {
   void add_details();

   void remove_details();

   void display_details();

   void first_empdetails();
}
 class Empdetails implements Employee {
  String emp_name;
  int id;
  long salary;
  int remove_emp;
  Scanner s = new Scanner(System.in);
public  void add_details(String emp_name, int id, long salary)
   { 
    System.out.println("Add employee details:");
    this.emp_name = emp_name;
    this.id = id;
    this.salary = salary;
   
  }

  public void remove_details() {
    System.out.println("remove the employee details:");
  

  }

  public void display_details() {
    System.out.println();
  }

  public void first_empdetails() {
    System.out.println("display the first employee details");
    
  }
}

class EmpInterface {
  public static void main(String[] args) {
    Empdetails obj =new Empdetails();
    obj.add_details("abc", 101, 900000);
    
     ArrayList a1= new ArrayList();
     a1.add(obj);
    System.out.println(a1);

    /*obj.add_details();
    obj.remove_details();
    obj.display_details();
    obj.first_empdetails();*/

  }
}