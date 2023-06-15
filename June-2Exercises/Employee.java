import java.util.*;
class MainEmployee
  {
    int id;
    String name;
   public  MainEmployee(int id, String name)
    {
      this.id=id;
      this.name=name;
    }
public int getId()
    {
	return id;
    }


public String getName() {
	return name;
}
  }
class Employee
  {
    public static void main(String[] r)
    {
      ArrayList<MainEmployee> l=new ArrayList<>();
      l.add(new MainEmployee(101,"balu"));
      l.add(new MainEmployee(102,"alladi"));
      for(MainEmployee e:l)
        {
          System.out.println(e.getId());
        }
    }
  }