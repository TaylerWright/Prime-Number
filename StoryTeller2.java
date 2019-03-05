/*

Invention Project 
2/5/10
**/
import javax.swing.JOptionPane;
import java.util.Scanner;
public class StoryTeller2 {
 public static void main(String[] args) {

final char OPINIONS = 3; // Number of employees 
char[] wordchoices = new char[OPINIONS]; // Array of hours

// Create a Scanner object for keyboard input. 
JOptionPane.showMessageDialog( null,"Welcome New Author!");

Scanner keyboard = new Scanner(System.in);

System.out.print("Choose a noun included in the list below:" + "\n" + 
"shoe" + "\n" + 
"dog" + "\n" + 
"phone" + "\n" + 
"man" + "\n" + 
" " );

wordchoices[0] = keyboard.next().charAt(0);

System.out.print("Choose a verb included in the list below:" + "\n" + 
"talk" + "\n" +
"smell" + "\n" +
"sleep" + "\n" +
"fart" + "\n" +
"jump" + "\n" + 
" " );
wordchoices[1] = keyboard.next().charAt(0);

System.out.print("Choose a adjective included in the list below:" + "\n" +
"slimy" + "\n" +
"tall" + "\n" +
"ugly" + "\n" +
"stinky" + "\n" +
"nice" + "\n" + 
" " );
wordchoices[2] = keyboard.next().charAt(0);

System.out.println( "During a " + wordchoices[2] + " evening, a " + wordchoices[0] + "began " + wordchoices[1] + "ing");
JOptionPane.showMessageDialog( null,"During a " + wordchoices[2] + " evening, a " + wordchoices[0] + "began " + wordchoices[1] + "ing");
   }

 }
//case switches 