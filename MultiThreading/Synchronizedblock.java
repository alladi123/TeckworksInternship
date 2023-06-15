import java.util.*;
class test
  {
  void method(int n)
    {
      synchronized(this)
        {
          System.out.println(n+" "+"table");
          for(int i=1;i<=5;i++)
            {
              System.out.println(n*i);
            }
        } 
    }
  }
class thread1 extends Thread
{
  test t;
  thread1(test t)
  {
    this.t=t;
  }
  public void run()
  {
    t.method(5);
  }
}
class thread2 extends Thread
{
  test t;
  thread2(test t)
  {
    this.t=t;
  }
  public void run()
  {
    t.method(10);
  }
}
class Synchronizedblock
  {
    public static void main(String[] r)
    {
      test obj=new test();
      thread1 t1=new thread1(obj);
      thread2 t2=new thread2(obj);
      t1.start();
      t2.start();
      
    }
  }