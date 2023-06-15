import java.util.*;
class Studentdetails
  {
    private int id;
    private String name;
    private String course;
    Studentdetails(int id,String name,String course)
    {
      this.id=id;
      this.name=name;
      this.course=course;
    }
    public String toString()
    {
      return "rollnumber is:"+this.id+" "+"student name:"+this.name+" "+"course:"+this.course;
    }
  }
    class Student
      {
  public static void main(String ...args)
        {
    /*Studentdetails s1=new Studentdetails(101,"ravi","python");
          Studentdetails s2=new Studentdetails(102,"balaji","java");*/
  
  List<Studentdetails> list=new ArrayList<>();
          
list.add(new Studentdetails(101,"bob","java"));
          System.out.println(list);
    
      
        }
      
    
  }