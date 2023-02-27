import java.util.*;
class Product{
  public static void main(String[] args)
  {
    System.out.println("show prices of books");
    int price[]={250,300,600,450};
   show(price,4);
  }
    public static void show(int a[],int n)
      {
    for(int i:a)
      {
        System.out.println(i);
      }
    for(int j=0;j<=n-1;j++)
      {
        System.out.println(a[j]);
      }
    
  }
}