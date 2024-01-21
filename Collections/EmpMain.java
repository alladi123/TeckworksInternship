import java.util.*;
class Employee
  {
    
    String emp_name;
    int id;
    int age;
    String address;
    long salary;
Employee(String emp_name,int id,int age,String address,long salary)
    {
      this.emp_name=emp_name;
      this.id=id;
      this.age=age;
      this.address=address;
      this.salary=salary;
    }
    public String getEmp_name() {
		return emp_name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public long getSalary() {
		return salary;
	}
    public String toString()
    {
      return "id:" + id + "Name:" + emp_name + "age:"+ age + "Address:"+ address + "Salary:" + salary;//give data all values for attributes
      //get return separate attribute
    }
  }
class EmpMain
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
  ArrayList<Employee> emplist=new ArrayList<>();
emplist.add(new Employee("abc",101,25,"tnk",90000));
emplist.add(new Employee("ccc",103,29,"vij",80000));
emplist.add(new Employee("ddd",104,49,"ong",95000));
    //travelling operation
    Iterator it=emplist.iterator();
  while(it.hasNext())
    {
      System.out.println(it.next());
    //next point current object
  //no need to call to string()
  //next implicit call toString() 
    }
  String verify=null;
 
  System.out.println("enter id to get employee details:");
  int sid=s.nextInt();
  for(Employee e:emplist)
    {//e points to emp obj
      if(e.getId()==sid)
      {
System.out.println("id:" + e.getId() + "Name:" + e.getEmp_name() + "Age" + e.getAge() + "Salary:" + e.getSalary());
        //e.toString();
        verify="found";
        break;
        
      }
    }
  if(verify==null)
  {
    System.out.println("not found");
  }
    
 String verify2=null;
   System.out.println("enter id to delete employee details:");
    int idremove = s.nextInt();
  for(Employee e :emplist) 
    {
 if(e.getId() == idremove) 
      {
        emplist.remove(e);
        verify2="found";
        break;
 }
    }
 if (verify2==null)
    {
    System.out.println("not found");
    }

    Iterator itr = employeeList.iterator();
 while (it.hasNext()) {
 System.out.println(itr.next());
  }
}

  
	