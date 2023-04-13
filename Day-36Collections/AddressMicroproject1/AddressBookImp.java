import java.util.*;
class AddressBookImp implements AddressBookInterface
{
    Scanner sc=new Scanner(System.in);
    HashMap <String,AddressBookData> h = new HashMap<>();
    public void add_contacts()
    {
        System.out.println("Enter no of contacts you want to add");
        String n=sc.nextLine();
        int num=Integer.parseInt(n);
        for(int i=0;i<num;i++)
            {
                System.out.println("Enter Address no");
                String adrnum=sc.nextLine();
                System.out.println("Enter Person name");
                String name=sc.nextLine();
                System.out.println("Enter House Number");
                String houseNum=sc.nextLine();
                System.out.println("Enter Street Name");
                String streetName=sc.nextLine();
                System.out.println("Enter Pin code");
                String pincode=sc.nextLine();
                h.put(adrnum,(new AddressBookData (person_name,house_number,street_name,pin_code)));
            }
    }
    public void edit_contacts()
    {
        if(h.size()==0)
           System.out.println("No Data is available to delete");
        else
       {
           System.out.println("Enter address number to edit details");
        String adrnum=sc.nextLine();
           String verify=null;
           for(String k:h.keySet())
               {
                 if(adrnum.equals(k)){
                     verify="found";
                   break;
                 }
               }
        if(verify!=null)
        {
        System.out.println("Enter Person name");
        String name=sc.nextLine();
        System.out.println("Enter House Number");
        String houseNum=sc.nextLine();
        System.out.println("Enter Street Name");
        String streetName=sc.nextLine();
        System.out.println("Enter Pin code");
        String pincode=sc.nextLine();
        hm.replace(adrnum,new AddressBookData (name,houseNum,streetName,pincode));
        }
           else
            System.out.println("Not found");
        }
    }
    public void delete_contacts()
    {
       if(h.size()==0)
           System.out.println("No Data is available to delete");
        else
       {
           System.out.println("Enter Address num to delete");
           String adrnum=sc.nextLine();
           String verify=null;
           for(String k:h.keySet())
               {
                 if(adrnum.equals(k))
                 {
                     verify="found";
                   break;
                 }
               }
        if(verify!=null)
           h.remove(adrnum);
        else 
            System.out.println("not found");
       }
    }
    public void search_contacts()
    {
        if(h.size()==0)
           System.out.println("No Data is available to delete");
        else
       {
           System.out.println("Enter Address num to delete");
           String adrnum=sc.nextLine();
           String verify=null;
           for(String k:h.keySet())
               {
                 if(adrnum.equals(k))
                 {
                     verify="found";
                   break;
                 }
               }
        if(verify!=null)
            System.out.println(h.get(adrnum));
           else
            System.out.println("Not found");
        }      
    }
    public void display()
    {
        System.out.println(h);
    }
}