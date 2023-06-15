import java.util.*;
class ComparableTest1 implements Comparator<ComparableTest1>
  {
    int id;
    String name;
   public ComparableTest1(int id,String name)
    {
      this.id=id;
      this.name=name;
      }
   
    public int compare(ComparableTest1 a1)
    {
        return Integer.compare(a1.id,a2.id);
    
  }
  }
class ComparableTest
  {
    public static void main(String[] r)
    {
  ArrayList<ComparableTest1> l=new ArrayList<>();
  l.add(new ComparableTest1(102,"va"));
  l.add(new ComparableTest1(101,"ni"));
      Collections.sort(l,new ComparableTest1());
      for(ComparableTest1  t:l)
        {
          System.out.println(t.id+" "+t.name);
        }
    }
    }
  