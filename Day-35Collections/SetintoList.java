import java.util.*;
//Set into list
class SetintoList
  {
    public static void main(String[] args)
    {
      Set s=new HashSet();
      s.add(100);
      s.add(200);
      s.add("satya");
      s.add("teja");
      List l=new ArrayList(s);
      Iterator i=l.iterator();
      while(i.hasNext())
        {
          System.out.println(i.next());
        }
    }
  }