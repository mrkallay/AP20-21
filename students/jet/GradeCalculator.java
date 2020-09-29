import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal grade.");
        double score = input.nextDouble();
        System.out.println("The score you entered is: " + score);

        if (score >= 94) {
            System.out.println("Grade is A.");
        }
        else if (score >= 90 && score <= 93) {
            System.out.println("Score is A-");
        }
        else if (score >= 87 && score <= 89) {
            System.out.println("Score is B+");
        }
        else if (score >= 83 && score <= 86) {
            System.out.println("Score is B");
        }
        else if (score >= 80 && score <= 82) {
            System.out.println("Score is B-");
        }
        else if (score >= 77 && score <= 79) {
            System.out.println("Score is C+");
        }
        else if (score >= 73 && score <= 76) {
            System.out.println("Score is C");
        }
        else if (score >= 70 && score <= 72) {
            System.out.println("Score is C-");
        }
        else if (score >= 67 && score <= 69) {
            System.out.println("Score is D+");
        }
        else if (score >= 63 && score <= 66) {
            System.out.println("Score is D");
        }
        else if (score >= 60 && score <= 62) {
            System.out.println("Score is D-");
        }
        else if (score >= 59 && score < 59) {
            System.out.println("Score is F");
        }



    }
}

