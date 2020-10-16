import java.util.*;
public class ForLoopPractice {

    public static void main(String[] args) {

        for (int i = 0; i <= 9999; i++){
            System.out.println(i);

        }

        for (int i =10000; i >= -1; i--){
            System.out.println(i);
        }

        for (int i = 0; i <=1000; i++){
            if(i%2 == 0)
                continue;
            else{
                System.out.println(i);
            }

        }
        String stringOne = new String("The quick brown fox jumped over the lazy dog");
        for(int i = 0; i <= stringOne.length() -1; i++){
            System.out.println(stringOne.charAt(i));
        }
        for(int count = stringOne.length()-1; count >= 0; count--)
        {
            System.out.println(stringOne.charAt(count));
        }
    }
}