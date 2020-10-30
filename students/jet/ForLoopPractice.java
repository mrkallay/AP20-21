import java.util.*;
public class ForLoopPractice {

    public static void main(String[] args) {

        for (int i = 0; i <= 9999; i++) {
            System.out.println(i);

        }

        for (int i = 10000; i >= -1; i--) {
            System.out.println(i);
        }

        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 0)
                continue;
            else {
                System.out.println(i);
            }

        }
        String stringOne = new String("The quick brown fox jumped over the lazy dog");
        for (int i = 0; i <= stringOne.length() - 1; i++) {
            System.out.println(stringOne.charAt(i));
        }
        for (int count = stringOne.length() - 1; count >= 0; count--) {
            System.out.println(stringOne.charAt(count));
        }
        int vowelCount = 0;
        for (int i = 0; i <= stringOne.length() - 1; i++) {
            char vowel = stringOne.charAt(i);
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
                vowelCount++;


            }
        }
        System.out.println("There are " + vowelCount + " vowels in this sentence.");
        System.out.println(stringOne.toUpperCase());

        int a = 7;
        int b = a%4;
        double c = (double)(a/b);
        System.out.println(c);

        int j = 4;
        while(j <= 11)
        {
            if(j %2 == 0 && j != 4)
            {
                j =  j + 3;
            }
            else if ( j + 5 == 10)
            {
                j = j + 2;
            }
            else
            {
                j++;
            }
            System.out.println("j: "+ j );
        }


    }


}