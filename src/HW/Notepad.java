package HW;

import java.lang.reflect.Array;
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


        int r = 10;

        for (int y = 0; y <= 2 * r; y += 2) {
            // Длина шага y равна 2, и изменение длины шага y может превратить круг в эллипс.
            Integer x1 = (int) Math.round(r - Math.sqrt(2 * r * y - y * y));
            Integer len = 2 * (r - x1); //// Расстояние между двумя симметричными

            for (int i = 0; i <= x1; i++) {  // расстояние слева от консоли
                System.out.print(" ");
            }
            System.out.print(" * ");

            for (int j = 0; j <= len; j++) {
                System.out.print(" ");
            }
            System.out.println(" * ");
        }

        //HW5 #8

        Person me = new Person(1982);
        Person Olga = new Person("Olya", 1982, "f");

        me.setName("Gregory");
        me.setSex("M");

        System.out.println(me.getName() + "\t\t"
                + me.getAge() + " yrs\tsex: " + me.getSex());
    }
}
        
        
    


