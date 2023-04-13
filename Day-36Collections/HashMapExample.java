import java.util.*;
class HashMapExample
  {
public static void main(String[] args)
    {
HashMap<Integer,String> h=new HashMap<>();
      h.put(1, "balu");
      h.put(2,"ramcharan");
      h.put(3,"abc");
      h.put(4,"def");
      System.out.println(h);
      System.out.println(h.size());
    Set s1=h.keySet();
      System.out.println(s1);
  Collection c=h.values();
  System.out.println(c);
  Set entry=h.entrySet();
    System.out.println(entry);
  System.out.println(h.remove(3));
      
    }
  }