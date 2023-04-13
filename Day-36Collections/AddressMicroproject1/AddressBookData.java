import java.util.*;

class AddressBookData {
  int house_number;
  String person_name;
  String street_name;
  long pin_code;
  long phone_number;

  public AddressBookData(String person_name,int house_number, String street_name,long pin_code) {
    this.house_number = house_number;
    this.person_name = person_name;
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

  public long getPhone_number() {
    return phone_number;
  }

  public void setPhone_number(long phone_number) {
    this.phone_number = phone_number;
  }

}