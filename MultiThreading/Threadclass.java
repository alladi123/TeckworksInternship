class Threadclass1 extends Runnable
  {
   public  void run()
    {
  System.out.println("I am running thread");
    }
  }
public class Threadclass
  {
    public static void main(String[] args)
    {
    Threadclass1 t=new Threadclass1();
    t.start();
  }
  }