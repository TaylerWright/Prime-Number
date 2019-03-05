//Code Listing 10-34
/** 
This program demonstrates the FinalExam3 class which 
implements the Relatable interface.
*/

public class RealtableExams{
public static void main (String[] args){

   //Exam #1 had 100 questions and the student missed 20 of them
   FinalExam3 exam1 = new FinalExam3(100, 20);
   
   // Exam #2 had 100 questions and the student
 // missed 30 questions.
  FinalExam3 exam2 = new FinalExam3(100, 30);

 // Display the exam scores.
 System.out.println("Exam 1: " + exam1.getScore());
 System.out.println("Exam 2: " + exam2.getScore());
 
 //Compare the exam scores.
 if (exam1.equals(exam2))
   System.out.println("The exam scores are equal.");
   
   if (exam1.isGreater(exam2))
   System.out.println("The exam 1 score  is the highest.");
   
   if (exam1.isLess(exam2))
System.out.println("The Exam 1 score is the lowest.");
}
}