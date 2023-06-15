import java.util.*;
class Uniquevowels
  {
    public static void unique(String str)
    {
      char c[]=str.toCharArray();
      int count[]=new int[str.length()];
      for(int i=0;i<=str.length()-1;i++)
        {
          count[i]=1;
          for(int j=i+1;j<=str.length()-1;j++)
            {
              if(c[i]==c[j])
              {
                count[i]++;
                c[j]='0';
              }
            }
        }
      for(int j=0;j<=count.length-1;j++)
        {
          if(count[j]==1 && c[j]!='0')
          {
            if(c[j]=='a' || c[j]=='e' || c[j]=='i' || c[j]=='o' || c[j]=='u')
            {
              System.out.println(c[j]);
            }
          }
        }
    }
    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      unique(str);
    }
  }