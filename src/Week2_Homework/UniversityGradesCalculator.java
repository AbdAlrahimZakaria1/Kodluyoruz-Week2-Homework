package Week2_Homework;
import java.util.Scanner;

public class UniversityGradesCalculator {
    /*
    * This function calculates and prints the letter grade of given grades
    * @author Abd Alrahim Zakaria - 05.07.2021
    */
    public static void main(String[] args) {

        System.out.println("Welcome to the University Letter Calculator! \nPlease enter your midterm and final grades");
        System.out.println("Your letter grade is: "+LetterGrade());
    }

    public static double GradeCalculator(double midTerm, double finals) {
        return (int) Math.round(midTerm*40/100 + finals*60/100);
    }

    public static String LetterGrade() {
        Scanner scanner = new Scanner(System.in);
        int grade = (int) GradeCalculator(scanner.nextDouble(), scanner.nextDouble());
        if (grade >= 0 && grade < 20) {
            System.out.println(grade);
            return "FF" ;
        }
        else if (grade >= 20 && grade < 50)
            return "CB";
        else if (grade >= 50 && grade < 70)
            return "BB";
        else if (grade >= 70 && grade <= 100)
            return "AA";
        else
            return "Grade isn't valid!";
    }
}