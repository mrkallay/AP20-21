

public class paper1
{

    public static void main(Integer[] args) {
        int j = 3;
        while (j <= 9 || j % 2 == 0) {
            if (j < 5) {
                j++;
            }

            if (j % 2 == 0) {
                j++;
            } else {
                j = j + 3;
            }

            System.out.println(j);
        }
    }
}

