import java.util.*;
class test
  {
  public static synchronized void method(int a)
    {
      System.out.println(a+" " +"table");
      for(int i=0;i<=5;i++)
        {
          System.out.println(a*i);
        }
    }
  }
 class thread1 extends Thread
  {
    public void run()
    {
      test.method(10);
    }
  }
 class thread2 extends Thread
  {
    public void run()
    {
      test.method(20);
    }
  }
public class Synchronization
  {
  public static void main(String[] r)
    {
    thread1 t1=new thread1();
    thread2 t2=new thread2();
      t1.start();
      t2.start();
    }
  }