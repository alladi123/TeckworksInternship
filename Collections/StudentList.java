import java.util.*;
class Student
  {
    String name;
    String id;
    int totalmarks;
    Student(String name,String id,int totalmarks)
    {
      this.name=name;
      this.id=id;
      this.totalmarks=totalmarks;
    }
	public String getName() {
		return name;
	}
	
public String getId() {
		return id;
	}
public int getTotalmarks() {
		return totalmarks;
	}
    public String toString()//return string combined
    {
      return(name+" "+id+" "+totalmarks);
    }
    
}
class StudentList
  {
    public static void main(String[] args)
    {
      ArrayList<Student> ar1=new ArrayList<>();
ar1.add(new Student("abc","101",87));
       System.out.println(ar1.toString());
  
      //parametarized constaructor
      ArrayList<Student> ar2=new ArrayList<>();
  ar2.add(new Student("xyz","233",90));
      System.out.println(ar2.toString());
  
      for(Student s2:ar1)
        
          System.out.println(s2);
         System.out.println(ar1.toString());
      Student obj=ar1.get(0);
      System.out.println(obj.getName());
      System.out.println(obj.getId());
      System.out.println(obj.getTotalmarks());
      
    }
  }