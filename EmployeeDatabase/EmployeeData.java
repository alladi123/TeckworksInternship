class EmployeeData
  {
    int emp_id;
    String empname;
    double salary;
EmployeeData(int emp_id,String empname,double salary)
    {
    this.emp_id=emp_id;
      this.empname=empname;
      this.salary=salary;
  }
public int getEmp_id() {
	return emp_id;
}
public String getEmpname() {
	return empname;
}

public double getSalary() {
	return salary;
}
public String toString()
    {
      return "id:"+ " "+ getEmp_id()+ "name:"+ getEmpname()+" "+"salary:"+" "+ getSalary();
    }
  }