import java.util.*;
class Employeesalary
  {
    public static void gross(int salary)
    {
     float HRA,DA;
    if (salary<=10000)
      {
        HRA=salary*20/100;
        DA=salary*80/100;
          }
        else if(salary<=20000) {
          HRA=salary*25/100;
          DA=salary*90/100;
            }
      else{
        HRA=salary*30/100;
      DA=salary*95/100;
              }
   float gross=salary+HRA+DA;
          System.out.println("employee salary gross is:"+gross);
    }
    public static void main(String[] arr)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the employee salary:");
      int salary=s.nextInt();
      Employeesalary e=new Employeesalary();
      e.gross(salary);
    }
  }