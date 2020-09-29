import java.util.*;
import java.util.Scanner;

public class WhilePractice
{
    public static void main(String[] args)
    {
        //create a while loop that will continue until count is LESS THAN zero
        //inside the body of the loop print the value of count and 
        //decrease the value of count by 1 each iteration
        int count = 10000;
        while (count >= 0) {
            count--;
            System.out.println(count);
        }


        //create a while loop that will stop once x is equal to 100
        //inside the body of the loop print the value of x and 
        //increase the value of x by 2 each iteration
        int x = 0;
        while (x < 100)
        {
            x+=2;
            System.out.println(x);
        }
        //the following while loop should exit when "q" is entered by the user but
        //there is a bug in the code, fix it.
        Scanner s = new Scanner(System.in);
        System.out.println("What should I repeat? (q to quit):");
        String in  = s.nextLine();
        while (in != "q") {
            System.out.println("You said: " + in);
            System.out.println("Should I repeat something else? (q to quit)");
            in = s.nextLine();
        }
    }

}