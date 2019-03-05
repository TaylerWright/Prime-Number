// Code-listing 10-30 and Code-listing 10-36
//Dominic Russell
public class Person implements Displayable {
 private String name;

 // Constructor
 public Person(String n)
{
 name = n; 
 }
 // display method
 public void display()
 {
System.out.println("My name is " + name); }
}

/**
{
 private String name;
/**
This class implements the Displayable interface, but does not override the default display method.

public class Person implements Displayable

 // Constructor
 public Person(String n)
 {
 name = n;
 }
 }
 */