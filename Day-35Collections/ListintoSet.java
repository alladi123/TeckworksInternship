import java.util.*;
//list to set
class ListintoSet
  {
    public static void main(String[] args)
    {
      List l=new ArrayList();
      l.add(1);
      l.add(2);
      l.add("balu");
      l.add(true);
      l.add("balu");
      
      Set s=new HashSet(l);
    for(Object t:s)
      {
        System.out.println(t);
      }
     List<String> list=new ArrayList<>();
      list.add("balu");
      list.add("alladi");
      list.add("abc");
      Set<String> s1=new HashSet(list);
      for(String s2:s1)
        {
          System.out.println(s2);
        }
    }
  }