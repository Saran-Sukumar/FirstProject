/*
 *  Name: Saran Sukumar
 *  The program will calculate a final grade for this class based on the category weights.
 */

public class GradeCalc
{
    public static void main(String[] args)
    {
        // percentage weights (constants)
        final double PARTICIPATION_WEIGHT = 0.15;
        final double GE_WEIGHT = 0.20;
        final double QUIZ_WEIGHT = 0.25;
        final double PROJECT_WEIGHT = 0.20;
        final double FINAL_WEIGHT = 0.20;

        // example category grades (variables)
        double participationGrade = 95;
        double guidedExplorationsGrade = 92;
        double quizGrade = 88;
        double projectGrade = 87;
        double finalDemoGrade = 93;

        // calculate final grade using the weights
        double finalGrade =
                (participationGrade * PARTICIPATION_WEIGHT) +
                        (guidedExplorationsGrade * GE_WEIGHT) +
                        (quizGrade * QUIZ_WEIGHT) +
                        (projectGrade * PROJECT_WEIGHT) +
                        (finalDemoGrade * FINAL_WEIGHT);

        // display result
        System.out.println("Name: Saran Sukumar");
        System.out.println("Final Grade: " + finalGrade);
    }
}