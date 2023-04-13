import java.util.*;
//convert arraylist into linked

class ArraylistToLinkedlist
  {
    public static void main(String[] args)
    {
      ArrayList l=new ArrayList();
     
      l.add(1);
      l.add("abc");
      l.add(2);
      l.add(3);
      l.add(90.9); 
       Iterator i=l.iterator();
       while(i.hasNext())
        {
      System.out.println(i.next());
        }
      LinkedList l1=new LinkedList(l);
      
       Iterator i1=l1.iterator();
      while(i1.hasNext())
        {
          System.out.println(i1.next());
        }
      ArrayList<Character> arr=new ArrayList<>();
         arr.add('a');
        arr.add('b');
      arr.add('c');
      arr.add('d');
      
  LinkedList<Character> linkList = new LinkedList<>();
		for (char arr1 : arr) 
    {
			linkList.add(arr1);
		}
      System.out.println(linkList);
    }
  }
