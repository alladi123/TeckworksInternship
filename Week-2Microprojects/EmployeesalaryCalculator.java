import java.util.*;

public class EmployeesalaryCalculator
  {
  public static void main(String args[]) 
    {
      Scanner s=new Scanner(System.in);
      System.out.println("EMPLOYEE SALARY CALCULATOR");
System.out.println("Enter how many employee's slaries you want");
 int number=s.nextInt(); 
  while(number-->0)
    {
      int tax;
       System.out.println("Enter the employee salary:");
      int salary=s.nextInt();
      int annual_salary=salary*12;
      if(annual_salary>=200000 && annual_salary<=300000)
      {
        tax=annual_salary*10/100;
      }
      else if(annual_salary>=300000 && annual_salary<=400000)
      {
       tax=annual_salary*20/100;
      }
      else{
         tax=annual_salary*40/100;
      }
  System.out.println("Employee Annual Salary is:"+annual_salary);
  System.out.println("Employee Tax is:"+tax);
  int net_salary=annual_salary-tax;
  System.out.println("Employee Net salary is:"+net_salary);
   
} 
  }
  }
    
      