package HW;

public class HW4 {
    public static void main(String[] args) {

    //1
        int x = 9;

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j <= x; j++)
            {
                System.out.print(j);
            }

            x--;

            System.out.println();
        }

    //2

        x = 9;

        for (int i = 0; i < 10; i++) {

            System.out.print(" ".repeat(i));

            for (int j = 0; j <= x; j++)
            {
                System.out.print(j);
            }

            x--;

            System.out.println();
        }

    //3

        x = 9;

        for (int i = 0; i < 10; i++) {

            System.out.print(" ".repeat(i));

            for (int j = x; j >= 1; j--)
            {
                System.out.print(j);
            }

            System.out.print("0");

            for (int k = 1; k <= x; k++)
            {
                System.out.print(k);
            }

            x--;

            System.out.println();
        }

    //4

        System.out.println(summation(15,22));
        System.out.println(substraction(15,22));
        System.out.println(product(15,22));
        System.out.println(division(15,22));
    }

    //4

    public static int summation(int first, int second){
        return(first + second);
    }
    public static int substraction(int first, int second){
        return(first - second);
    }
    public static int product(int first, int second){
        return(first * second);
    }
    public static double division(double first, double second){
        return(first / second);
    }
}



