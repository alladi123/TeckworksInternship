import java.util.*;
class Peter
  {
    public static void main(String[] str)
    {
      Scanner s=new Scanner(System.in);
      String st=s.nextLine();
      int c1=0,c2=0;
      for(int i=0;i<=st.length()-1;i++)
        {
          if(st.charAt(i)=='0')
          {
            c1++;
          }
            else
          {
            c2++;
            
          }
        }
      if(c1<c2)
      {
        System.out.println("win");
      }
      else{
        System.out.println("lose");
      }
  }
  }