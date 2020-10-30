import java.util.Scanner;
public class PracticePaper
{
    public static void main(String[] args)
    {

        String text = "ABCdEfG";
        System.out.print(text.toUpperCase());
        System.out.println(text.toLowerCase());

        double x = 2.3;
        double y = 2;
        double z = 7;

        System.out.println( Math.round(x) + z/y );

      String s = "abcdefg";
      for(int count = s.length() - 1; count >= 0; count--){
          System.out.println(s.charAt(count));
      }

        System.out.println("Enter something:" );
        Scanner input = new Scanner(System.in);
        String something = input.nextLine();





    }



    }

