import java.util.Scanner;
import java.lang.Math;
public class MathPractice {

    public static void main(String[] args)
    {
        // 1) Instantiate a new scanner object for reading input from the user

        System.out.println("Enter a integer number");
        Scanner scan = new Scanner(System.in);



        // 2) Prompt the user to enter an integer and use the scanner object to assign it to a variable

        int num = scan.nextInt();


        // 3) Use the Math class to get the absolute value of the entered integer and display
        //    the result to the screen.  Be sure to test with negative values

        System.out.println(Math.abs(num));

        // 3) Prompt the user twice for integers and assign them to two separate variables
        System.out.println("Enter a integer number");
        Scanner scan1 = new Scanner(System.in);
        int num2 = scan.nextInt();

        System.out.println("Enter another integer number");
        Scanner scan2 = new Scanner(System.in);
        int num3 = scan.nextInt();


        // 4) Without using conditional logic display the larger of the integers to the screen

        System.out.println(Math.max(num2, num3));
        System.out.println();

        // 5) Prompt the user to enter a decimal number (double) and use the scanner object to assign it to a variable

        System.out.println("Enter a decimal number");
        Scanner scan4 = new Scanner(System.in);
        double num4 = scan.nextInt();

        // 6) Use the Math class to round the double up and down to the nearest double (see floor/ceil)



        System.out.println("Ceiling of '" + num4 + "' = " + Math.ceil(num4));

        System.out.println("Floor of '" + num4 + "' = " + Math.floor(num4));




    }
}