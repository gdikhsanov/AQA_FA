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

        int size = 40;                      //размер квадратного поля
        String[] c = new String[size];      //Пустой массив
        String x = "x";                     //служебный символ
        String brush = "*";                 //кисть - чем рисуем - любая строка, кроме "x". Хоть xxxxxxxxxx
        String width = "   ";               // Количеством пробелов выбираем ширину круга

        for (int i = size; i >= 0; i--) {   // i - это координата Y

                                            //общая формула (x – a)2 + (y – b)2 = R2, где а и b - это координаты центра

            int xCoordR = (int)             // это формула координаты Х правой части
                Math.round(Math.sqrt(Math.pow((size) / 2.0, 2) - Math.pow((i) - size / 2.0, 2)) + size/2.0 - 1);

            int xCoordL = (int)             // это формула координаты Х левой части
                (size/2.0 - Math.round(Math.sqrt(Math.pow((size) / 2.0, 2) - Math.pow((i) - size / 2.0, 2))));

            c[xCoordR] = x;                 //присваиваем правый символ ячейке массива
            c[xCoordL] = x;                 //присваиваем левый символ ячейке массива

             for (int j = 0; j < size; j++) {      // стираем лишние символы из массивов прошлых строк
                if (Objects.equals(c[j], x)) {     // т.к. они накапливаются в массиве

                    c[j] = brush;               // рисуем символ кисти в занятые ячейку
                }
                else c[j] = width;              //в пустые рисуем пробелы
             }

           System.out.println(Arrays.toString(c).replace(", ","")); //печатаем строки, удаляя запятые.
         }

        //      #8.1

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        size = 40;                      //размер квадратного поля

        //      #8.1

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        size = 40;                      //размер квадратного поля

        String brush1 = "*";                 //кисть - чем рисуем - любая строка, кроме "x". Хоть xxxxxxxxxx
        String spases = "   ";               // Количеством пробелов выбираем ширину круга

        for (int i = size; i >= 0; i--) {   // i - это координата Y

            //общая формула (x – a)2 + (y – b)2 = R2, где а и b - это координаты центра

            int xx = (int)             // это формула координаты Х левой части
                    (size/2.0 - Math.round(Math.sqrt(Math.pow((size) / 2.0, 2) - Math.pow((i) - size / 2.0, 2))));

            System.out.println(spases.repeat(xx) + brush1 + spases.repeat(size-xx-xx) + brush1); //печатаем строки.
        }String brush1 = "*";                 //кисть - чем рисуем - любая строка, кроме "x". Хоть xxxxxxxxxx
        String spases = "   ";               // Количеством пробелов выбираем ширину круга

        for (int i = size; i >= 0; i--) {   // i - это координата Y

            //общая формула (x – a)2 + (y – b)2 = R2, где а и b - это координаты центра

            int xx = (int)             // это формула координаты Х левой части
                    (size/2.0 - Math.round(Math.sqrt(Math.pow((size) / 2.0, 2) - Math.pow((i) - size / 2.0, 2))));

       System.out.println(spases.repeat(xx) + brush1 + spases.repeat(size-xx-xx) + brush1); //печатаем строки.
        }
    }
}
