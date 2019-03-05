/** 
A class thAt holds a grade for a grade activity.
*/

public class GradedActivity 
{
 private double score; // Numeric score 
 
 /** 
 The setScore method sets the score field.
 @param s the value tp store in score.
 */
 
  public void setScore(double s)
   {
    score=s; 
    }
     /**
     the getScore methods returns the score.
     @return The value stored in the score field.
     */
     
     public double getScore()
     {
     return score;
     }
     /**
     the getGrade method returns a letter grade 
     determined from the score field.
     @return the letter grade.
     */
     public char getGrade()
     {
     char letterGrade;
     
     if(score >=90)
         letterGrade= 'A';
      else if (score >=80)
          letterGrade='B';
          else if (score >=70)
          letterGrade= 'C';
          else if (score >= 60)
           letterGrade = 'D';
           else 
            letterGrade ='F';
            return letterGrade;
            
            }
       }
            