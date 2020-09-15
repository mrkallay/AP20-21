public class MoreStrings {

    public static void main(String[] args)
    {

        //Assume a variable named myString exists and refers to a String object that has an odd number of characters and length >= 3.
        // Create a Java statement that would print the middle character only of the String.

        String myString = new String("ZeroTwo");
        int midindex = myString.length() / 2;
        System.out.println(myString.charAt(midindex));

        //Assume a variable named myString exists and refers to a String object that has a length >= 2.
        // Create a Java statement(s) that would print the last character followed by the first character of the String.

        String myString2 = new String("Zero");
        System.out.println(myString.charAt(myString.length()-1));
        System.out.println(myString.charAt(0));


    }
}
