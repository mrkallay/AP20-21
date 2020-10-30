public class StringPractice {

    public static void main(Integer[] args)
    {

        String mystring = new String("Jet's World");
        String mystring2 = new String("Jet's World 2");
        String x = "ok";


        System.out.println();
        System.out.println(mystring);
        System.out.println(mystring2);

        System.out.println(mystring.length());
        System.out.println(mystring2.length());

        System.out.println(mystring.toUpperCase());
        System.out.println(mystring2.toUpperCase());

        System.out.println(mystring.toLowerCase());
        System.out.println(mystring2.toLowerCase());

        System.out.println(mystring + mystring2);

        String myStringConcat = mystring;
        myStringConcat = mystring.concat(mystring2);
        System.out.println(myStringConcat);


        System.out.println(mystring.charAt(0));
        System.out.println(mystring2.charAt(0));

        //cannot figure out problem
        int y= mystring.length();
        System.out.println(mystring.charAt(y));

        int z= mystring2.length();
        System.out.println(mystring2.charAt(z));




    }

}
