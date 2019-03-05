import javax.swing.JOptionPane;

/** 
This program demonstrates the finalExam class, 
whwhich extends the GradeActivity class. 
*/

public class finalExamDemo
{
 public static void main(String [] args)
  {
  String input; // To hold input 
  int questions; // Number of questions
  int missed;  // Number of questions missed
  
  // Get the number of question on the exam.
  
  input = JOptionPane.showInputDialog("How many "+ "questions are on the final exam?");
  questions = Integer.parseInt(input);
  
  // Get the number of questions the student misses.
  
  input = JOptionPane.showInputDialog("How many" + "questions are on the final exam?");
  missed = Integer.parseInt(input);
  
  //Create a finalExam object.
  
  finalExam exam = new finalExam(questions, missed);
  
  // Display the test results. 
  
  JOptionPane.showMessageDialog(null,
  "Each question counts"+ exam.getPointsEach() +
  "points.\nThe exam score is" + exam.getScore() + "\nThe exam grade is " +
  exam.getGrade());
  
  System.exit(0);
  }
 }