import java.util.*;
class Test
  {
    public static void Frequency(String s1)
    {

        int[] freq = new int[256];
        for (int i = 0; i <=s1.length()-1; i++) {
            char c = s1.charAt(i);
            freq[c]=freq[c]+1;
          }
        for (int i = 0; i <freq.length-1; i++) 
        {
            if (freq[i]>0) 
            {
       System.out.println((char)i+":"+ freq[i]);
            }
       }
    }   
  public static void main(String[] arg)
    {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the string:");
      String str=new String(s.nextLine());
     Frequency(str); 
    }
  }