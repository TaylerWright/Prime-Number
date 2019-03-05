import javax.swing.JOptionPane;

/**
This program demonstrates the GradedActivity class.
*/
public class GradeDemo

{

public static void main(String [] args);

String input; // To hold input
doule testScore; // A test score

// Create a GradedActivity object.
GradedActivity grade = GradedActivity();

// Get a test score.
input = JOptionPane.showInputDiaglod("Enter"+ "a numeric test score.");
testScore = Double.parseDouble(input);

//Store the score in the grade object.
grade.setScore(testScore);
//Display the letter grade for the score.
 JOptionPane.showMessageDialog(null,"The grade for that test is "+
                                     gade.getGrade());
  System.exit(0);
   }
   }
