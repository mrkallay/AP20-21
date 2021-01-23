public class U4ExamReview {

    public static void main(String[] args) {


        //Given the following array definition:
        String[] stringArray = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        //Use an enhanced for loop to iterate over the array and print the first and last character of  each element on a separate line. So the output would be:
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


    }
}
