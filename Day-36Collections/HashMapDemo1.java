import java.util.*;
public class HashMapDemo1
{
    public static void main (String a[])
    {
        HashMap < Price, String > hm = new HashMap < Price, String > ();
        hm.put (new Price ("Banana", 20), "first object");
        hm.put (new Price ("Apple", 40), "Second object");
        hm.put (new Price ("Orange", 30), "Third object"); 
        for (Map.Entry u: hm.entrySet())
        {
       System.out.println (u.getKey()+ "  " +u.getValue());
        }
    }
}
class Price
{
    private String item;
    private int price;
    public Price (String itm, int pr)
    {
        this.item = itm;
        this.price = pr;
    } 
    public String getItem ()
    {
        return item;
    }
    public int getPrice ()
    {
        return price;
    } 
    public String toString ()
    {
        return "item: " + item + "  price: " + price;
    }
}