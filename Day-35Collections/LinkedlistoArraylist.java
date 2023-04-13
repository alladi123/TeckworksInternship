import java.util.*;
class LinkedlistoArraylist
  {
    public static void main(String[] args)
    {
      LinkedList l=new LinkedList();
      l.add(23);
      l.add("balaji");
      l.add('c');
      l.add(68.7);
      l.add("abc");
      l.add("hello");
       Iterator i=l.iterator();
      while(i.hasNext())
        {
      System.out.println(i.next());
        }
      ArrayList<Integer> l1=new ArrayList<>(l);
       Iterator i1=l.iterator();
       while(i1.hasNext())
        {
      System.out.println(i1.next());
        }
     
    }
  }