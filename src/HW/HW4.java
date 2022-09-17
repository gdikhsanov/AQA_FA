package HW;

import java.util.Arrays;
import java.util.Objects;

public class HW4 {
    public static void main(String[] args) {

        int number = 0;

        //      #1

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int s = 0;

        for (int i = 0; i < array.length; i++) {

            s += array[i];

        }
        System.out.println(s);

        //      #2

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        //System.out.println(Arrays.stream(array).max());

        s = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] > s)
                s = array[i];
        }

        System.out.println(s);

        //      #3

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        s = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] < s)
                s = array[i];
        }

        System.out.println(s);

        //      #4

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        s = 0;

        for (int i = 0; i < array1.length; i++) {

            s += array1[i];
        }

        System.out.println(s / array1.length);

        //      #5

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        s =0;
        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        for (int i = 0; i < array2.length; i++) {

            for (int j = 0; j < array2[i].length; j++) {

                s += array2[i][j];

            }
        }

        System.out.println(s);

        //      #6

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        s =0;

        for (int i = 0; i < array2.length; i++) {

            for (int j = 0; j < array2[i].length; j++) {

                if (array2[i][j] > s) {
                    s = array2[i][j];
                }
            }
        }

        System.out.println(s);

        //      #7

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        s =0;

        for (int i = 0; i < array2.length; i++) {

            for (int j = 0; j < array2[i].length; j++) {

                s++;

            }
        }

        System.out.println(s);

        //      #8

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        int size = 40;
        String[] c = new String[size];
        String x = "x";
        String brush = "xxxxxxxxxxx";
        String width = "   ";

        Arrays.fill(c, " ");

        for (int i = size; i >= 0; i--) {

            int xCoordR = (int)
                Math.round(Math.sqrt(Math.pow((size) / 2.0, 2) - Math.pow((i) - size / 2.0, 2)) + size/2.0 - 1);
            int xCoordL = (int)(size/2.0 -
                Math.round(Math.sqrt(Math.pow((size) / 2.0, 2) - Math.pow((i) - size / 2.0, 2))));

        c[xCoordR] = x;
        c[xCoordL] = x;

             for (int j = 0; j < size; j++) {
                if (Objects.equals(c[j], x)) {

                    c[j] = brush;
                    //c[j] = String.valueOf(xCoordR);
                }
                else c[j] = width;
             }

           System.out.println(Arrays.toString(c).replace(", ",""));
         }
    }
}
