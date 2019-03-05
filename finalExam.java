/** 
This class determines the grade for final exam.
*/ 

public class finalExam extends GradedActivity
{

private int numQuestions;  //Number of question
private double pointsEach; //Points for each question
private int numMissed;     // Questions misses

/**
The constructor sets the number of question on the
exam and the number of question missed.
@param question The number of questions.
@param missed the numer of question misses
*/
   
public finalExam(int questions, int missed)
{
double numericScore;       //To hold a numeric score
//Set the numQuestions and numMisses field.
numQuestions = questions;
numMissed = missed;

// Calculate the points for each question and
//the numeric score for ths exam.
pointsEach = 100.0 / questions;
numericScore = 100.0 - (missed * pointsEach);
// call the inherited setScore method to 
//set the numeric score.
}
/**
The getPointsEach method returns the number of point
each question is worth.
@return thr value in the pointEach field.
*/
public double getPointsEach()
{
return pointsEach;
}
/**
public double getNumMissed method return the number of 
question missed.
@return The valur in the numMissed field.
*/

public int getNumMissed()
{
 return  numMissed;
 }
 }