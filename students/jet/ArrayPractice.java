import java.lang.reflect.Array;
import java.util.Random;
/*
        Created by Brian Kallay
*/

public class ArrayPractice {

    public static void main (String[] args)
    {

        //array definition
        int[] intArray = new int[4];
        intArray[0] = 100;
        intArray[1] = 50;
        intArray[2] = 25;
        intArray[3] = 0;


        //printing the number of elements in the array
        System.out.println("Number of elements in myIntArray: "  + intArray.length);

        //TODO: 1) print the first element in the array - index = 0
        System.out.println(intArray[0]);

        //TODO: 2) print the last element in the array - don't use a hardcoded index
        System.out.println(intArray[intArray.length-1]);

        //TODO: 3) use a for loop to print each element in the array
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        //TODO: 4) use a for loop to print each element in reverse order
        for (int i = intArray.length-1; i >= 0; i--) {
            System.out.print(intArray[i] + " ");
        }


        //alternate definition syntax
        //int intArrayTwo[] = new int[3];
        System.out.println();
        //TODO: 5) initialize the values of the array to random ints between 5 and 10
        //TODO:    does order matter (can you start with index 2) ?
        int min = 5;
        int max = 10;
        int[] intArrayTwo = new int[3];
        intArrayTwo[1] = (min+(int)Math.random()*(max-min+1));
        intArrayTwo[2] = (min+(int)Math.random()*(max-min+1));
        intArrayTwo[0] = (min+(int)Math.random()*(max-min+1));

        for(int i = 0; 1 < intArrayTwo.length; i++)
        {
            intArrayTwo[i] = min + (int) (Math.random() * (max - min +1));

        }

        //TODO: use an enhanced for loop to print each element

        for(int num: intArrayTwo) //for num in intArrayTwo
        {
            System.out.println(num);
        }
        String[] strings = {"a", "b", "c"}; //String strings[] = {"a", "b", "c"};
        System.out.println(strings[0] + strings[2]);
        }
    }
