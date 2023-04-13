/*Address Book: Create a class called AddressBook that stores a collection of contacts in a HashMap. The class should have methods to add, edit, and delete contacts, as well as to search for a contact by name.*/
import java.util.*;
class AddressMicroproject
  {
    public static void main(String[] args)
    {
      AddressMicroproject1 a=new AddressMicroproject1();
      
HashMap<AddressMicroproject1, Long> h=new HashMap<AddressMicroproject1, Long>();
    h.put( new AddressMicroproject1(123,"ravi"),9347792324L);
    h.put( new AddressMicroproject1(124,"balu"),70723473757L);
    }
  }
class AddressMicroproject1
  {
    private int house_number;
    private String person_name;
    private String state_name;
    private long pin_code;
    private long phone_number;
    Scanner s=new Scanner(System.in);
    public AddressMicroproject1(int house_number,String person_name)
    {
      this.house_number=house_number;
      this.person_name=person_name;
    }
	public int getHouse_number() {
		return house_number;
	}
	
	public String getPerson_name() {
		return person_name;
	}
	
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public long getPin_code() {
		return pin_code;
	}
	public void setPin_code(long pin_code) {
		this.pin_code = pin_code;
	}
public void add()
    {
      System.out.println("enter the house number and person name:");
      int t=s.nextInt();
      for(int i=0;i<=t;i++)
        {
      int house=s.nextInt();
      String person=s.next();
        Long ph_num=s.nextLong();
      h.put(new AddressMicroproject1(house,person),ph_num);
        }
    }
    
    
}