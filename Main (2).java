
/**
 * A program that would return the final grade based on the following input:
 *      Exam grade (0 to 100) stored in examGrade
 *      Average homework grade (0 to 10) stored in aHWGrade
 *      Number of submitted assignments (0 to 8 ) submittedAssignments
 *      
 * @author (Ori)
 * @version (3/6/2018)
 */

import java.util.Scanner;
public class Main
{
    // instance variables - replace the example below with your own
    private double examGrade;     
    private double aHWGrade;    // average Homework Grade
    private int nOSA;        //Number Of Submitted Assignments
    Scanner scannerInput = new Scanner(System.in);

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
        examGrade = 0;
        aHWGrade = 0;
        nOSA = 0;
        getUserInputs();
        double finalGrade = calculateGrade(examGrade,aHWGrade,nOSA);
        System.out.println("The Student's final grade is:" + finalGrade);
        
    }

    /**
     * A method that retrives input from the user and stores the info inside
     * the class's parameters accordingly.
     * The method uses the Scanner scannerInput object and the variables
     * examGrade, aHWGrade and nOSA to store the data
     */
    public void getUserInputs()
    {
       System.out.println("Please enter the Exam's grade (0-100)");
       examGrade = scannerInput.nextDouble();
       System.out.println("Please enter the average homework grade (0-10)");
       aHWGrade = scannerInput.nextDouble();
       System.out.println("Please enter the number of submitted assignments");
       nOSA = scannerInput.nextInt();
    }
    
    /**
     * A method that calculates the grade using the provided parameters and
     * returns the calculated grade.
     */
    public double calculateGrade(double examGrade, double aHWGrade, int nOSA)
    {   
        double grade;
        double weightOfHWGrade = 0.0;
        switch (nOSA)
            {
                case 1:
                case 2:
                case 3:
                case 4: System.out.println("Too few assignments, student" +
                                           " failed!");
                        return grade = 0.0;
                        
                case 5:
                case 6: if (examGrade >= 55)
                        {
                            weightOfHWGrade = 0.2;
                        }
                        else if (examGrade < 55)
                        {
                            return grade = examGrade;
                        }
                        else if ((examGrade > 100) || (examGrade < 0))
                        {
                            System.out.println("examGrade out of bounds");
                            return grade = 0.0;
                        }
                        break;
                        
                case 7:
                case 8: if (examGrade >= 55)
                        {
                            weightOfHWGrade = 0.3;
                        }
                        else if (examGrade <= 54)
                        {   
                            if (aHWGrade >= 8)
                            {   
                                weightOfHWGrade = 0.25;
                            }
                            else if (aHWGrade < 8)
                            {
                                weightOfHWGrade = 0.2;
                            }
                        }
                        else if ((examGrade > 100) || (examGrade < 0))
                        {
                            System.out.println("examGrade out of bounds");
                            return grade = 0.0;
                        }
                        break;
                        
                default:
                            System.out.println("aHWGrade out of bounds");
                            return grade = 0.0;    
            }
        
        grade = (examGrade * 0.8) + (aHWGrade*0.1) + (nOSA*0.1);
        return grade;
    }
}
