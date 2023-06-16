/*Challenge-4:
You have been tasked with developing a payroll system for a company. The company has various types of employees such as programmers, team leads, assistant project managers and project managers. 
All employees have some common attributes like Emp_name, Emp_id, Address, Mail_id and Mobile_no. In addition, all employees have a Basic Pay (BP) which is used to calculate their salary.
The company has a fixed salary structure for all employees which includes 97% of BP as DA, 10% of BP as HRA, 12% of BP as PF and 0.1% of BP for staff club fund. Your task is to design and implement an inheritance hierarchy to represent the employees and their salaries.
Your program should allow the user to input the employee details such as name, ID, address, email and mobile number. 
Additionally, the program should allow the user to input the Basic Pay for each employee. The program should then generate the pay slip for each employee, showing their gross and net salary.

Write a Java program that implements the above scenario using inheritance.*/
import java.util.*;
class Employee
  {
    String emp_name;
    int emp_id;
    String address;
    String mail_id;
    long mobile_no;
    long salary;
    Scanner s=new Scanner(System.in);
  }
class programmers extends Employee
  {
    void prog_details()
    {
    System.out.println("enter the programmer name:");
    emp_name=s.nextLine();
    System.out.println("enter the programmer id:");
      emp_id=s.nextInt();
      System.out.println("enter the programmer address:");
      address=s.nextLine();
      System.out.println("enter the programmer mail id:");
      mail_id=s.nextLine();
      System.out.println("enter the programmer mobile number:");
      mobile_no=s.nextLong();
    }
    void prog_salary()
    {
       System.out.println("enter the programmer salary:");
       salary=s.nextLong(); 
    }
   // 97% of BP as DA, 10% of BP as HRA, 12% of BP as PF and 0.1% of BP for
    void  prog_funds()
    {
      float HRA,DA,PF,staffclubFund;
      HRA=salary*10/100;
      DA=salary*97/100;
      PF=salary*12/100;
      staffclubFund=salary*0.1/100;
      System.out.println("HRA gross is:"+HRA);
      System.out.println("DA gross is:"+DA);
      System.out.println("PF gross is:"+PF);
       System.out.println("staffclubFund is:"+staffclubFund);
     }
    void prog_paySlip()
    {
      double gross=salary+HRA+DA+PF;
      System.out.println("programmer gross is:"+gross);
      
    }
    }
class teamleads extends Employee
{
  void teamleads_details()
    {
    System.out.println("enter the teamleader name:");
    emp_name=s.nextLine();
    System.out.println("enter the teamleader id:");
      emp_id=s.nextInt();
      System.out.println("enter the teamleader address:");
      address=s.nextLine();
      System.out.println("enter the teamleader mail id:");
      mail_id=s.nextLine();
      System.out.println("enter the teamleader mobile number:");
      mobile_no=s.nextLong();
    }
  void salary()
    {
       System.out.println("enter the teamleader salary:");
       salary=s.nextLong(); 
    }
   void teamleader_funds()
    {
      float HRA,DA,PF,staffclubFund;
      HRA=salary*10/100;
      DA=salary*97/100;
      PF=salary*12/100;
      staffclubFund=salary*0.1/100;
      System.out.println("HRA gross is:"+HRA);
      System.out.println("DA gross is:"+DA);
      System.out.println("PF gross is:"+PF);
       System.out.println("staffclubFund is:"+staffclubFund);
     }
  void teamleaders_paySlip()
    {
      float gross=salary+HRA+DA+PF;
      System.out.println("teamleader gross is:"+gross);
      
    }
  
}
class assistantProjectManagers extends Employee
  {
    void assistantManager_details()
    {
    System.out.println("enter the assistantProjectManager name:");
    emp_name=s.nextLine();
    System.out.println("enter the assistantProjectManager id:");
      emp_id=s.nextInt();
      System.out.println("enter the assistantProjectManager address:");
      address=s.nextLine();
      System.out.println("enter the assistantProjectManager mail id:");
      mail_id=s.nextLine();
      System.out.println("enter the assistantProjectManager mobile number:");
      mobile_no=s.nextLong();
    }
    void salary()
    {
       System.out.println("enter the assistantProjectManager salary:");
       salary=s.nextLong(); 
    }
    void AssistantManager_funds()
    {
      float HRA,DA,PF,staffclubFund;
      HRA=salary*10/100;
      DA=salary*97/100;
      PF=salary*12/100;
      staffclubFund=salary*0.1/100;
      System.out.println("HRA gross is:"+HRA);
      System.out.println("DA gross is:"+DA);
      System.out.println("PF gross is:"+PF);
       System.out.println("staffclubFund is:"+staffclubFund);
     }
     void AssistantManager_paySlip()
    {
      float gross=salary+HRA+DA+PF;
      System.out.println("AssistantManager gross is:"+gross);
    }
  
  }
class projectManagers extends Employee
  {
    void ProjectManagers_details()
    {
    System.out.println("enter the ProjectManager name:");
    emp_name=s.nextLine();
    System.out.println("enter the ProjectManager id:");
      emp_id=s.nextInt();
      System.out.println("enter the ProjectManager address:");
      address=s.nextLine();
      System.out.println("enter the ProjectManager mail id:");
      mail_id=s.nextLine();
      System.out.println("enter the ProjectManager mobile number:");
      mobile_no=s.nextLong();
    }
    void salary()
    {
       System.out.println("enter the ProjectManager salary:");
       salary=s.nextLong(); 
    }
    void  ProjectManager_Funds()
    {
      float HRA,DA,PF,staffclubFund;
      HRA=salary*10/100;
      DA=salary*97/100;
      PF=salary*12/100;
      staffclubFund=salary*0.1/100;
      System.out.println("HRA gross is:"+HRA);
      System.out.println("DA gross is:"+DA);
      System.out.println("PF gross is:"+PF);
       System.out.println("staffclubFund is:"+staffclubFund);
     }
     void ProjectManager_paySlip()
    {
      float gross=salary+HRA+DA+PF;
      System.out.println("AssistantManager gross is:"+gross);
    }
  }
class Challenge4
  {
  public static void main(String[] args)
    {
    programmers p=new programmers();
      p.prog_details();
      p.prog_salary();
      p.prog_funds();
      p.prog_paySlip();
    teamleads  t=new teamleads();
      t.teamleads_details();
      t.salary();
      t.teamleader_funds();
      t.teamleader_paySlip();
    assistantProjectManagers as=new   assistantProjectManagers();
      as.assistantManager_details();
      as.salary();
      as.AssistantManager_funds();
      as.AssistantManager_paySlip();
    projectManagers pm=new projectManagers();
      pm.ProjectManagers_details();
      pm.salary();
      pm.ProjectManager_Funds();
      pm.ProjectManager_paySlip();
    }
  }
  