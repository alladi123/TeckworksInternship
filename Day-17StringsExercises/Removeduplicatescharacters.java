import java.util.*;
class Removeduplicatescharacters
  {
    public static void display(String str)
    {
     System.out.println("remove duplicate characters");
      char c1=' ';
       int[] freq = new int[256];
        for (int i = 0; i <=str.length()-1; i++) {
            char c = str.charAt(i);
            freq[c]=freq[c]+1;
          }
        for (int i = 0; i <freq.length-1; i++) 
        {
            if (freq[i]>1) 
            {
              continue;
             //c1+=(char)i;
            }
         // System.out.println("duplicate characters are:"+(char)i);
        }
      
   }


public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string:");
      String s1=s.nextLine();
      display(s1);
    }
  } 
    