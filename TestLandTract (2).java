//TestLandTract.java

import java.util.Scanner;

public class TestLandTract

{

public static void main(String[] args)

{

Scanner scan = new Scanner(System.in);

System.out.print("Enter length for land tract 1: ");
//Enter length of land on tract 1
double length = scan.nextDouble();

System.out.print("Enter width for land tract 1: ");
// Show length of land on tract 1
double width = scan.nextDouble();

LandTract land1 = new LandTract(length, width);

  

System.out.print("Enter length for land tract 2: ");
//Enter length of land on tract 2
length = scan.nextDouble();

System.out.print("Enter width for land tract 2: ");
//show length of land on tract 2
width = scan.nextDouble();

LandTract land2 = new LandTract(length, width);

  

System.out.println("Area of land1: " + land1.area());

System.out.println("Area of land2: " + land2.area());

if (land1.equals(land2))

System.out.println("They are of equal size.");
// show what is equal to 
else

System.out.println("They are NOT of equal size.");
// if not show this
}

}