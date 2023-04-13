import java.util.*;
class EmpMain
  {
    public static void main(String[] args)
    {
      char ch;
      int option;
      Scanner s=new Scanner(System.in);
      EmployeeImp empobj=new EmployeeImp();
  System.out.println("1.Add employee details");
  System.out.println("2.delete employee details");
  System.out.println("3.search employee details");
  System.out.println("4.display employee details");
      
      do{
        System.out.println("enter your choice");
        option=s.nextInt();
        switch(option)
          {
            case 1: empobj.insert();
              break;
            case 2: empobj.delete();
              break;
            case 3: empobj.search();
              break;
            case 4: empobj.display();
              break;
            default: 
              System.out.println("invalid option");
          }
        System.out.println("do you want to continue one more operation");
        ch=s.next().charAt(0);
      }
        while(ch!='n');
        
         
        }
      }
    
  