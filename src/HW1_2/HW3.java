package HW1_2;

public class HW3 {

    public static void main(String[] args) {

        int task = 0;
        System.out.println("-----------------\nЗадача " + ++task + "\n-----------------");

        int a = 33;
        int b = 15;

        if (a == b) {
            System.out.println(a + " == " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " > " + b);
        }

        System.out.println("-----------------\nЗадача " + ++task + "\n-----------------");

        int a1 = 33;
        int b1 = 15;

        if ((a1 + b1) % 2 == 0) {
            System.out.printf("maybe %d and %d are even\n", a1, b1);
        } else {
            System.out.println("some varible is odd");
        }

        System.out.println("-----------------\nЗадача " + ++task + "\n-----------------");

        int a3 = 300;

        if (a3 > 10) {
            System.out.println(a3 + " больше 10");
        }
        if (a3 < 100) {
            System.out.println(a3 + " меньше 100");
        }
        if (a3 / 2 > 20) {
            System.out.println("результат деления " + a3 + " на 2 больше 20");
        }
        if (5 <= a3 && a3 <= 40) {
            System.out.println("значение переменной " + a3 + "  между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной " + a3 + "  меньше 5 или больше 40");
        }

        System.out.println("-----------------\nЗадача " + ++task + "\n-----------------");

        for (int i = 0; i <= 15; i++) {
            System.out.println(i);
        }

        System.out.println("-----------------\nЗадача " + ++task + "\n-----------------");

        int a4 = 5;
        int result = 10000;

        System.out.printf("Положительные степени числа %d, которые меньше %d.\n", a4, result);

        for (int i = result; i > 1; i--) {

            if (Math.log(i) % Math.log(a4) < 0.00001){     // дробная часть логарифма i с основанием a4
                System.out.printf("%d в степени %d = %d\n", a4, (int)(Math.log(i) / Math.log(a4)), i);
            }
        }
/**
 *     System.out.println((int)Math.pow(5,3)); // 3^4
 *     Math.log(i) / Math.log(a4) //логарифм i с основанием a4
 *     System.out.println((Math.log(125) / Math.log(5))); // выдаёт 3.0000000000000004 Надо переводить в decimal???
 */


        System.out.println("-----------------\nЗадача " + task + " с возведением в степень\n-----------------");

        int a5 = 5;
        int result1 = 10000;
        double maxSt = (Math.log(result1) / Math.log(a5));

        System.out.printf("Положительные степени числа %d, которые меньше %d.\n", a4, result1);

        for (int i = 1; i <= maxSt; i++) {

            if (Math.pow(5,i) <= result1){
                System.out.printf("%d в степени %d = %d\n", a5, i, (int)(Math.pow(5,i)));
            }
        }

        System.out.println("-----------------\nЗадача " + ++task + " a)\n-----------------");

        int from = 40;
        int to = 60;
        int a6 = 4;

        System.out.printf("Числа кратные %d между числами %d и %d включительно.\n", a6, from, to);

        for (int i = from; i <= to; i++) {

            if ((i % a6 == 0)) {
                System.out.println(i);
            }
        }

        System.out.println("-----------------\nЗадача " + task + " b)\n-----------------");

        from = 40;
        to = 60;
        a6 = 4;

        System.out.printf("Числа кратные %d между числами %d и %d включительно.\n", a6, from, to);

        for (int i = from; i <= to; i=i+4) {

            System.out.println(i);
        }
    }
}


