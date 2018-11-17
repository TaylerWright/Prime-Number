/** 

Name:Tayler
Date:11-17-18
Purpose:Figure out if a number is a prime number or not.
 

*/


import java.util.Scanner;

public class Prime{
   
   public static void main(String[] args) {
   
      System.out.println("enter a number");//ask user for nunber.
            Scanner kb= new Scanner(System.in);
      int num= kb.nextInt();//recieve user input
      
      boolean prime= true;
      
      for(int i=2; i<num;i++){
      
         if(num%i==0){//will see if the number is divisible by more than just 1
         prime=false;
        
         }
      }
       if(prime== true)
       System.out.print("it is a prime number");
       
       else 
       System.out.print(" Not a prime number");
    }

}