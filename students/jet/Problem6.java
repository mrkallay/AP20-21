import java.util.*;
public class Problem6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String songs =
                "1. Green Day - American Idiot\n" +
                        "2. Jesus Jones - Right Here, Right Now\n" +
                        "3. Indigo Girls - Closer to Fine\n" +
                        "4. Peter Tosh - Equal Rights\n";

        String searchText;  //text that is searched for
        int foundIndex;     //position of where text is found
        int count = 0;      //number of occurrences of search text

        System.out.print("Enter search text: ");
        searchText = in.nextLine();

        /* YOUR CODE GOES HERE! */

        foundIndex = songs.indexOf(searchText);
        if(foundIndex != -1)
        {
            System.out.println("Found It");
            count++;
            foundIndex = songs.indexOf(searchText, foundIndex +1);
        }


        System.out.println("Number of occurrences of \"" + searchText + "\":" + count);
    }
}
