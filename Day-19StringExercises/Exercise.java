import java.util.*;
class Exercise
  {
    public static void show(String str)
    {
      //first non-repeating
      /*for(int i=0;i<=str.length()-1;i++)
        {
      if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))
      {
     System.out.println(str.charAt(i));
       break; 
      }*/

  //REMOVE DUPLICATES
   /*  StringBuilder sb = new StringBuilder();
     int idx;
for (int i = 0; i < str.length(); i++) {
    char c = str.charAt(i);
    idx = str.indexOf(c, i + 1);
    if (idx == -1) {
        sb.append(c);
    }*/
    String ar[]=str.split(" ");
      int max=ar[0].length();
      for(int i=1;i<=ar.length-1;i++)
        {
          if(max<ar[i].length())
          {
            max=ar[i];
          }
        }
          System.out.println(max);
  
  
}
        
        
    
    
public static void main(String[] args)
  {
  Scanner scan=new Scanner(System.in);
  System.out.print("enter the string:");
  String s= new String(scan.nextLine());
    //new String(scan.nextLine());
  show(s);
  }
}