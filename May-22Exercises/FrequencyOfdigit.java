import java.util.*;
public class  FrequencyOfdigit
  {
    public static void frequency(int num)
    {
      int count=0,d,i;
      for(i=0;i<=9;i++)
        {
          int temp=num;
          while(temp>0)
            {
              d=temp%10;
              if(d==i)
              {
                count++;
              }
              temp=temp/10;
            }
           
        }
      if(count>0)
          {
            System.out.println("frequency of"+i+":"+count);
          }
    }
    public static void main(String[] a)
    {
      Scanner s=new Scanner(System.in);
      System.out.print("enter the number:");
      int number=s.nextInt();
      frequency(number);
    }
  }