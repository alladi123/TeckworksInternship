import java.util.*;
class Candles
  {
    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      int size=s.nextInt();
      int array[]=new int[size];
      for(int i=0;i<=size-1;i++)
        {
          array[i]=s.nextInt();
        }
      int max=array[0];
      for(int i=0;i<=size-1;i++)
        {
          if(array[i]>max)
          {
            max=array[i];
          }
        }
      int count=0;
      for(int j=0;j<=size-1;j++)
        {
          if(max==array[j])
          {
            count++;
          }
        }
      System.out.println(count);
    }
  }