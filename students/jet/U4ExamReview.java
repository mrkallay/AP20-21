import java.util.Arrays;

public class U4ExamReview {

    public static void main(String[] args) {


        //Given the following array definition:
        String[] stringArray = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        //Use an enhanced for loop to iterate over the array and print the first and last character of  each element on a separate line.
        //  So the output would be:
        //te
        //qk
        //bn
        //fx
        //js
        //or
        //te
        //ly
        //dg

        for( String x : stringArray)
        {
            System.out.print(x.charAt(0));
            System.out.println(x.charAt(x.length()-1));
        }

        //Create a for loop that prints the stringArray defined above in reverse order.
        for(int i = stringArray.length-1; i >= 0; i--)
        {
            System.out.println(stringArray[i]);
        }

        //Given the following array (with an equal number of even and odd integers)

        int[] nums = {11, 5, 2, 60, 32, 9, 21, 4};

        //Create two arrays: odds & evens and iterate over the nums array populating the odds and even
        //arrays with the appropriate integers. (Hint: you will need two variables to manage the index
        // values of each of the two new arrays.)
        int[] odds = new int[nums.length/2];
        int oddIndex = 0;
        int[] evens = new int[nums.length/2];
        int evenIndex = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 ==0)
            {
                evens[evenIndex] = nums[i];
                evenIndex++;
            }

        }
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 != 0)
            {
                odds[oddIndex] = nums[i];
                oddIndex++;
            }
        }
        System.out.println(Arrays.toString(evens));
        System.out.println(Arrays.toString(odds));

        //Create an array named reverse and populate it with the values from nums2 in reverse order

        int[] nums2 = {100,90,80,70,60,50,40,30,20,10};
        int[] reverse = new int[nums2.length];
        int reverseIndex = 0;

            for (int i = nums2.length-1; i >= 0; i--)
            {
                reverse[reverseIndex] = nums2[i];
                reverseIndex++;
            }
        System.out.println(Arrays.toString(reverse));


        // #8 Given the following array of ints (populated with random numbers between -50 and 50):


        int[] randomVals = new int[1000];
        int min = -50;
        int max = 50;
        for(int i=0;i<randomVals.length;i++)
        {
            randomVals[i] = min + (int)(Math.random() * (max - min + 1));
        }
        int positive = 0;
        for(int i = 0; i < randomVals.length; i++)
        {
            if (randomVals[i] >= 0)
            {
                positive++;
            }
        }

        int[] positiveVals = new int[positive];
        int index = 0;
        for(int i = 0; i < randomVals.length; i++)
        {
            if (randomVals[i] >= 0)
            {
               positiveVals[index] = randomVals[i];
               index++;
            }
        }
        System.out.println(Arrays.toString(positiveVals));
        //Create a second int array called positiveVals and populate it with the positive ints from randomVals.
        // (Hint: remember the FRQ, you will need one for loop to determine the appropriate length for positiveVals
        // and then another for loop to populate it.)


        //#9 Using the randomVals array from above implement the max algorithm to determine the largest integer
        // present in the array.
        int max2 = positiveVals[0];
        for( int x : positiveVals)
        {
            if (x > max2)
            {
                max2 = x;
            }
        }
        System.out.println(max2);

        //Using the randomVals array from above implement the sequential search algorithm to determine
        // if the integer 0 is present in the array.
        int zeroCounter = 0;
        for(int i = 0; i <= randomVals.length-1; i++)
        {
            if (randomVals[i] == 0)     
            {
                zeroCounter++;

            }
        }
        System.out.println("Zero found " + zeroCounter + " times.");


        String[] states = {"ca", "co", "mi", "ny"};

        for (String x : states)
        {
            System.out.println(x.toUpperCase());
        }

    }
}
