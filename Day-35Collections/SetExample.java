import java.util.*;
class SetExample
  {
    public static void main(String[] args)
    {
  Set h=new TreeSet();
    h.add('a');
      h.add('c');
      h.add('a');
      h.add('i');
      h.add('o');
      Iterator it=h.iterator();
      while(it.hasNext())
        {
          System.out.println(it.next());
        }
    }
  }