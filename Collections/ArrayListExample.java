import java.util.*;
class ArrayListExample
  {
  public static void main(String[] args)
    {
      
    ArrayList l=new ArrayList();
  ArrayList l1=new ArrayList(2);
      l.add("balu");
      l.add(90.9);
      l.add(23);
      l.add(true);
      l1.add(78.8);
      l1.add("hi");
      l1.add(90);
      System.out.println(l);
       System.out.println(l1);
System.out.println(l.get(2));
System.out.println(l.remove(3));
      System.out.println(l);
      System.out.println(l1.indexOf("hi"));
      System.out.println(l.set(1,"hello"));
      System.out.println(l);
  //Another way of creating ArrayList
      //Homogeneous type object
    ArrayList<Integer> ar=new ArrayList<>();
      ar.add(456);
      System.out.println(ar);
  //Heterogeneous type
   ArrayList<Object> ar1=new ArrayList<>();    
      
    }
  }