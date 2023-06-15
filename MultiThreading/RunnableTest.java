class Threadclass1 implements Runnable
  {
   public  void run()
    {
  for(int i=0;i<4;i++)
    {
      System.out.println(i);
    }
  System.out.println("I am running thread");
    }
  }
public class RunnableTest
  {
    public static void main(String[] args)
    {
      try{
    Threadclass1 t=new Threadclass1();
      Thread t1=new Thread(t);
    t1.start();
      t1.sleep(1000);
       Thread t2=new Thread(t);
    t2.start();
      t2.sleep(1000);
  
    }
    catch(Exception e)
  {
    System.out.println("error");
   }
  }
}


/*
// using runnable interfcae 
class Threadclass extends Thread
  {
   public  void run()
    {

      for(int i=0;i<3;i++)
        {
         System.out.println(i);
        try{
      Thread.sleep(2000);
        }
      catch(Exception t1)
          {
          System.out.println(t1);
          }
        }

    }
  }
public class ThreadExample{
  public static void main(String h[])
  {

    Threadclass tc=new Threadclass();
   // tc.run();
    Thread t1=new Thread(tc);
    t1.start();

    Thread t2=new Thread(tc);
    t2.start();

    Thread t3=new Thread(tc);
    t3.start();
  }
}
*/