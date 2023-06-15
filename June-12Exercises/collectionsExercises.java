import java.util.*;
class collectionsExercises
  {
    public static void main(String[] r)
    {

      /*ArrayList<String> studentNames=new ArrayList<>();
      studentNames.add("ravi");
      studentNames.add("david");
      studentNames.add("raju");
      studentNames.add("bob");
      for(int i=0;i<=studentNames.size()-1;i++)
        {
          System.out.println(i+1+"-"+studentNames.get(i));
        }
      
    }
  }*/
List<Integer> l=new ArrayList<>();
      l.add(100);
      l.add(1);
      l.add(0);
ArrayList<Integer> list=new ArrayList<>();
      list.add(17);
      list.add(23);
      list.add(1);
      list.add(9);
      list.add(0,100);
      list.set(0,101);
      list.addAll(0,l);
      Collections.sort(list);
      System.out.println(list);
   //lambda list.forEach(v -> System.out.println(v));
 
      Iterator<Integer> itr=list.iterator();
      while(itr.hasNext())
        {
      System.out.println(itr.next());
        }
      ListIterator<Integer> it=list.listIterator();
      while(it.hasNext())
        {
          System.out.println(it.next());
        }
    }
  }
