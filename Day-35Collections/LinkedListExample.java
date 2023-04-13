import java.util.*;
class LinkedListExample
  {
    public static void  main(String[] args)
    {
    LinkedList l= new LinkedList();
      l.add(1);
      l.add("abc");
      l.add('d');
      l.add(32);
      System.out.println(l);
      l.addFirst("def");
      l.addLast(100);
      System.out.println(l.getFirst());
      System.out.println(l.getLast());
    l.removeFirst();
      System.out.println(l);
      LinkedList<Integer> l1=new LinkedList<>();
      l1.add(1);
      l1.add(23);
      l1.add(234);
      System.out.println(l1);
      LinkedList<Object> l2=new LinkedList<>();
      l2.add("abcd");
      l2.add(450);
      l2.add('e');
      l2.add(90);
      LinkedList l5=new LinkedList();
      l5.add(11);
      l4.add(22);
      l5.add(54);
    Enumeration e=l5.enumeration();
      while(e.hasMoreElements())
        {
          System.out.println(e.hasElement());
        }
      Iterator i=l1.iterator();
      while(i.hasNext())
        {
          System.out.println(i.next());
        }
      LinkedList l4=new LinkedList();
      l4.add(1);
      l4.add(2);
      l4.add(5);
      ListIterator it=l4.listIterator();
      while(it.hasNext())
        {
          System.out.println(it.next());
        }
    }
  }