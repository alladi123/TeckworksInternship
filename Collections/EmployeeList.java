import java.util.*;
class Employee
  {
    String emp_name;
    int id;
    String address;
    long salary;
Employee(String emp_name,int id,String address,long salary)
    {
      this.emp_name=emp_name;
      this.id=id;
      this.address=address;
      this.salary=salary;
    }
    public String toString()
    {
      return(emp_name+" "+id+" "+address+" "+salary);
    }
  }
class EmployeeList
  {
    public static void main(String[] args)
    {
  ArrayList<Employee> a1=new ArrayList<>();
  a1.add(new Employee("abc",101,"tnk",670000));
  a1.add(new Employee("cde",102,"vij",700000));
  a1.add(new Employee("fgh",103,"vij2",1200000));
      System.out.println(a1.toString());
System.out.println(a1.remove(1));
      System.out.println(a1.get(0));
      System.out.println(a1);
 ArrayList<Employee> a2=new ArrayList<>(); 
  a2.add(new Employee("xyz",103,"vij1",900000));
  a2.add(new Employee("xyz",104,"vij1",900000));
    for(Employee e:a2)
      System.out.println(a2);
    }
  }