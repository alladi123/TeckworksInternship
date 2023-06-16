import java.util.*;
class Section2Program4
  {
    public static String replace(String str)
    {
       Scanner s=new Scanner(System.in);
       String noun=s.nextLine();
      String adjective=s.nextLine();
      String activity=s.nextLine();
      str.replace("[noun]",noun);
      str.replace("[adjective]",adjective);
      str.replace("[activity]",activity);
      return str;
    }
       public static void main(String[] args)
     {
        
         String story=new String();
       story="[noun] was really [adjective] today. We learned how to write [activity] today. I can't wait for tomorrow!" ;
       String s1=replace(story);
       System.out.println(s1);
       replace(s1);
     }
  }