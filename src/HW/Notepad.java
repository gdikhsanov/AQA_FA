package HW;

import java.util.Arrays;

public class Notepad {

    public static void main(String[] args) {

        //      #8.1

        String[] c = new String[50];
        String x = "x";

        Arrays.fill(c, " ");

        for (int i = 0; i < c.length / 2 - 1; i++) {

            c[(int)(c.length / 2 - 1)-i] = x;
            c[(int)(c.length / 2)+i] = x;

            System.out.println(Arrays.toString(c).replace(", ",""));

        }
        Arrays.fill(c, "x");
        for (int i = 0; i < c.length / 2 - 1; i++) {

            c[(int)(c.length - 1) - i] = " ";
            c[i] = " ";

            System.out.println(Arrays.toString(c).replace(", ",""));

        }


    }

}
