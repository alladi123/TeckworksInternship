class InvalidAgeException extends Exception {
    String message;
    public InvalidAgeException(String message) {
       this.message=message;
    
    }
   String get()
   {
     return message;
   }
}
class Person {
    private String name;
    private int age;
 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    public void checkAge() throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        System.out.println(name + " is " + age + " years old.");
    }
}
 
public class CustomeException {
    public static void main(String[] args) {
        Person john = new Person("John", 25);
        Person jane = new Person("Jane", 150);
 
        try {
            john.checkAge();
            jane.checkAge();
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.get());
        }
    }
}
 