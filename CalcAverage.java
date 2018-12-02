 import java.util.Scanner;

 /**
4 This program gets a set of test scores and
5 uses the Grader class to calculate the average
6 with the lowest score dropped.
7 */

 public class CalcAverage
 {
 public static void main(String[] args)
 {
 int numScores; // hold the number of scores

 // Create a Scanner object for keyboard input.
 Scanner keyboard = new Scanner(System.in);

 // Get the number of test scores.
 System.out.print("How many test scores do you have? ");
 
 numScores = keyboard.nextInt();

 // Create an array to hold the test scores.
 double[] scores = new double[numScores];

 // Get the test scores and store them
 // in the scores array.
 for (int index = 0; index < numScores; index++)
 {
 System.out.print("Enter score #" +
 (index + 1) + ": ");
 scores[index] = keyboard.nextDouble();
 }

 // Create a Grader object, passing the
 // scores array as an argument to the
 // constructor.
 Grader myGrader = new Grader(scores);

 // Show the adjusted average score.
 System.out.println("Your adjusted average is " +
 myGrader.getAverage());

 // Show the lowest score from user.
 System.out.println("Your lowest test score was " +
 myGrader.getLowestScore());

 }
 }