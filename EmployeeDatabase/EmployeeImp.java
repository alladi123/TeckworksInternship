import java.util.*;
//import EmployeeDatabase.EmployeeData;
//import EmployeeDatabase.EmployeeInterface;

class EmployeeImp implements EmployeeInterface
  {
ArrayList<EmployeeData> emparr=new ArrayList<>();
   public  void insert()
    {
      Scanner s=new Scanner(System.in);
    System.out.println("enter employee details like id,name,salary");
      int id=s.nextInt();
      String name=s.next();
      double sal=s.nextDouble();
      emparr.add(new EmployeeData(id,name,sal));
    }
   public  void delete()
    {
  Scanner s=new Scanner(System.in);
     if(emparr.size()==0)
      {
  System.out.println("no data is available");
      }
        else
     {
       String verify=null;
       System.out.println("enter the employee id to delete");
      int empid=s.nextInt();
       for(EmployeeData e:emparr)
         {
           if(e.getEmp_id()==empid)
            emparr.remove(e);
             verify="found";
             break;
          }
    if(verify==null)
     {
    System.out.println("no data is available with this id");
     }
     }
     
    }
   public  void search()
    {
      Scanner s=new Scanner(System.in);
System.out.println("enter the id to search");
      String verify2=null;
int empid=s.nextInt();
      for(EmployeeData e:emparr)
         {
  if(e.getEmp_id()==empid)
  System.out.println("id:"+e.getEmp_id()+ " "+ e.getEmpname()+ " "+ e.getSalary());
    verify2="found";
    break;
       }
      if(verify2==null)
      {
        System.out.println("given emp not available");
      }
      
  }
    public void display()
    {
      if(emparr.size()==0)
      {
  System.out.println("no data is available");
      }
        else
      {
      Iterator itr=emparr.iterator();
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
    }
    }
  }