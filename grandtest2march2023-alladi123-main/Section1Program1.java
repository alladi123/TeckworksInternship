import java.util.*;
class Section1Program1
  {
    public static void displaycount(int num)
    {
      int note_count=0;
      if(num%100==0)
      {
      while(num>0)
        {
          if(num>=500 && num%100==0)
          {
          note_count+=((int)num/500);
          num=num%500;
            if(num%500!=0)
            {
              int a=num/200;
              note_count+=1;
            }
          }
          else if(num>=200 && num%100==0)
          {
            note_count=note_count+((int)num/500);
            num=num%200;
          }
          else {
            note_count=note_count+((int)num/100);
          }
          
       }
    System.out.println(note_count);
      }
      else{
        System.out.println("entered amount must be multiples of 100");
      }
        }
    
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      int amount=s.nextInt();
      displaycount(amount);
    }
  }