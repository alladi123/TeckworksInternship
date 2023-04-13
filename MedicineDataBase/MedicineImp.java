import java.util.*;

class MedicineImp implements MedicineInterface 
{
  ArrayList<MedicineData> mobj=new ArrayList<>();
  public   void insertMedicinedetails()
    {
      
      Scanner s=new Scanner(System.in);
      System.out.println("enter the medicine details like medicine name,type,company ,quantity,price");
       String Medicine_name=s.next();
      String Medicine_type=s.next();
    String company=s.next();
    int quantity=s.nextInt();
  double prices=s.nextDouble();
mobj.add(new MedicineData(Medicine_name,Medicine_type,company,quantity,prices));
    }

  public void deleteMedicine() 
  {
   Scanner s=new Scanner(System.in);
    if(mobj.size()==0)
    {
      System.out.println("no medicines are available");
    }
    else{
      String check=null;
       System.out.println("enter the medicine details  to delete");
      String medicinename=s.next();
       for( MedicineData e:mobj)
         {
           if(e.getMedicine_name()==medicinename)
            mobj.remove(e);
             check="found";
             break;
          }
    if(check==null)
     {
    System.out.println("no medicine is not available");
     }
     }
     
    }
  
  public void searchMedicine() 
  {
    Scanner s=new Scanner(System.in);
     if(mobj.size()==0)
    {
      System.out.println("no medicines are available");
    }
    else
     {
       String check2=null;
System.out.println("enter the medicine name to search:");
      
 String medicinename=s.next();
        for(MedicineData e:mobj)
         {
  if(e.getMedicine_name()==medicinename)
  
  System.out.println(e.getMedicine_name()+ " "+ e.getMedicine_type()+ " "+ e.getCompany()+" "+ e.getQuantity());
    check2="found";
    break;
  
       }
      if(check2==null)
      {
        System.out.println("given medicine name is not available");
      }
     }
      
  }

  public void displayMedicines() {
    if(mobj.size()==0)
      {
  System.out.println("no medicine data is available");
      }
        else
      {
      Iterator itr=mobj.iterator();
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
      }
  }
  }

