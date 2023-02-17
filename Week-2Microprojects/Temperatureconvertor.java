import java.util.*;

public class Temperatureconvertor {
  
  public static void main(String args[]) 
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Temperature Converter");
    System.out.println("Your choices are");
    System.out.println("1.Celsius to Fahrenheit heat");
    System.out.println("2.Kelvin to Fahrenheit heat");
    System.out.println("3.Celsius to Kelvin");
    System.out.println("4.Kelvin to Celsius");
    System.out.println("5.Fahrenheit heat to Celsius");
    System.out.println("6.Fahrenheit heat to Kelvin");
    System.out.println("Enter your choice:");
    int choice=s.nextInt();
    Temperatureconvertor t=new Temperatureconvertor();
    if(choice==1)
    {
      System.out.println("enter Celsisus value:");
      float Celsius=s.nextFloat();
     double a=t.CelsiustoFahrenheit(Celsius);
      System.out.println("Fahrenheit is:"+a);
    }
    else if(choice==2){
      System.out.println("enter kelvin value:");
      float Kelvin=s.nextFloat();
      double b=t.KelvintoFahrenheitheat(Kelvin);
      System.out.println("Fahrenheit is:"+b);
    }
    else if(choice==3){
      System.out.println("enter celsius value:");
      float Celsius=s.nextFloat();
      double c=t.CelsiustoKelvin(Celsius);
      System.out.println("Kelvin is:"+c);
    }
    else if(choice==4){
      System.out.println("enter kelvin value:");
      float Kelvin=s.nextFloat();
      double d=t.KelvintoCelsius(Kelvin);
      System.out.println("Celsius is:"+d);
    }
    else if(choice==5){
      System.out.println("enter fahrenheit value:");
      float Fahrenheit=s.nextFloat();
      double e=t.FahrenheitheattoCelsius(Fahrenheit);
      System.out.println("Celsius is:"+e);
    }
    else if(choice==6){
      System.out.println("enter fahrenheit value:");
      float Fahrenheit=s.nextFloat();
      double f=t.FahrenheitheattoKelvin(Fahrenheit);
      System.out.println("Kelvin is:"+f);
    }
    else{
      System.out.println("please select valid choice");
    }
  }
  public static double CelsiustoFahrenheit(float Celsius){
    double t1=(1.8*Celsius)+32;
    return t1;
    }
  public static double KelvintoFahrenheitheat(float Kelvin){
  return (Kelvin-273.15)*9/5+35;
  }
  public static double CelsiustoKelvin(float Celsius){
    return (Celsius+273.15);
  }
  public static double KelvintoCelsius(float Kelvin)
  {
    return (Kelvin-273.15);
  }
  public static double FahrenheitheattoCelsius(float Fahrenheit)
  {
    return (Fahrenheit-32)*5/9;
  }
  public static double FahrenheitheattoKelvin(float Fahrenheit)
  {
    return (Fahrenheit-32)*5/9+273.15;
  }
}
