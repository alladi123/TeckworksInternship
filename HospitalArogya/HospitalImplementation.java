import java.util.*;

class Invalidmobilenumber extends Exception 
{
  String message;

  public Invalidmobilenumber(String message) 
  {
    this.message = message;
  }
String get() {
    return message;
  }
}
public class HospitalImplementation implements HospitalInterface {
  Scanner s = new Scanner(System.in);
  ArrayList<HospitalData> arr = new ArrayList<>();

  public void add_Patient()
  {
   System.out.println("enter the patient details:");
    System.out.println("enter the patient id:");
    int patient_id=s.nextInt();
     System.out.println("enter the patient name:");
    String patient_name=s.next();
     System.out.println("enter the patient age:");
    int patient_age=patientage();
     System.out.println("enter the patient gender:");
    String patient_gender=s.next();
     System.out.println("enter the patient Adhaar number:");
    long AdharNumber=PatientadharNumber();
     System.out.println("enter the patient contact number:");
     long contact_number=PatientcontactNumber();
     System.out.println("enter the patient city name:");
     String cityname=s.next();
     System.out.println("enter the patient address:");
     String Patientaddress=s.next();
     System.out.println("enter the patient date of admission:");
    String Dateof_admission=s.next();
     System.out.println("enter the guardian name:");
     String guardian_name=s.next();
     System.out.println("enter the guardian adhaar number:");
     long guad_adhar=s.nextLong();
     System.out.println("enter the guardian contact number:");
     long guad_number=s.nextLong();
    arr.add(new HospitalData(patient_id,patient_name,patient_age,patient_gender,AdharNumber,contact_number,cityname,Patientaddress,Dateof_admission,guardian_name,guad_adhar,guad_number));
  }
    int patientage()
      {
      String patient_age=s.next();
   if(patient_age.length()==1 || patient_age.length()==2)
      {
        int p=Integer.parseInt(patient_age);
        return p;
      }
    else
      {
       System.out.println("enter the valid age");
       patientage();
        return 0;
      }
    }
    long PatientadharNumber() 
      {
     
    int count = 0;
     long adharnum=s.nextLong();
      while(adharnum>0)
        {
          adharnum=adharnum/10;
          count++;
        }
      if(count==12)
      {
        return adharnum;
      }
      else
      {
        System.out.println("enter valid adhar number");
        PatientadharNumber();
         return 0;
     }
       
    }
    long PatientcontactNumber()
      {
      int count=0;
    long contact= s.nextLong();
    while (contact> 0)
      {
      contact = contact / 10;
      count++;
      }
        try{
    if (count == 10) 
    {
    return contact;
    } 
        }
        
    catch(Exception e) 
    {
System.out.println("your mobile number is not having 10 digits");
      PatientcontactNumber();
      return 0; 
    }
    }
  public void view_data() {
    System.out.println("Display patient details");
  for(HospitalData d:arr)
    {
    System.out.println(d);
    }
  }

  public void search_by_id() 
  {
    System.out.println("enter the patient id to search:");
    int search_id = s.nextInt();
    String check = null;
    for (HospitalData ad : arr) 
    {
      if (ad.getPatient_id() == search_id) 
      {
        System.out.println(ad);
        check = "found";
      }
    }
    try
      {
    if (check == null) 
    
      throw new NullPointerException();
      }
catch(NullPointerException e)
	{
		System.out.println("NullPointerException:please enter valid patient id");
    search_by_id();
	}
    }
  public void search_by_age() {

    System.out.println("enter the patient age to be search:");
    int age_search = s.nextInt();
    String check = null;
    for (HospitalData ad : arr) {
      if (ad.getAge() == age_search) {
        System.out.println(ad.getName()+" "+ad.getAge()+" "+ad.getGender()+" "+ad.getAdhar_num()+" "+ad.getContact_num()+" "+ad.getAddress()+" "+ad.getDateof_admission()+" "+ad.getcity());
        check = "found";
      }
    }
    if (check == null) {
      System.out.println("enter valid patient age");
      search_by_age();
    }

  }

  public void search_city() {
    System.out.println("enter the city to be search:");
    String city_name = s.next();
    String check=null;
    for (HospitalData ad : arr) {
      if (ad.getcity() == city_name) 
      {
    System.out.println(ad.getName()+" "+ad.getAge()+" "+ad.getGender()+" "+ad.getAdhar_num()+" "+ad.getContact_num()+" "+ad.getAddress()+" "+ad.getDateof_admission()+" "+ad.getcity());
        check="found";
      }
    }
    if(check==null)
    {
      System.out.println("enter valid city name");
      search_city();
    }
  }
}