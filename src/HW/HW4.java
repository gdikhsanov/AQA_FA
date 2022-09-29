package HW;

public class HW4 {
    public static void main(String[] args) {

    //1 my
        int x = 9;

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j <= x; j++)
            {
                System.out.print(j + " ");
            }

            x--;

            System.out.println();
        }

        //1 Dima

        for (int i = 9; i >= 0; i--) {

            for (int j = 0; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }


        //2 my

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

        //2 Dima


        for (int i = 9; i >= 0; i--) {

            for (int j = 0; j < 9 -i; j++){
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }



        //3 my

        x = 9;

        for (int i = 0; i < 10; i++) {

            System.out.print("  ".repeat(i));

            for (int j = x; j >= 1; j--)
            {
                System.out.print(j + " ");
            }

            System.out.print("0 ");

            for (int k = 1; k <= x; k++)
            {
                System.out.print(k + " ");
            }

            x--;

            System.out.println();
        }


        //3 Dima

        for (int i = 9; i >= 0; i--) {

            for (int j = 0; j < 9 -i; j++){
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--){
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
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
    public static int product(int first, int second){ //multiply
        return(first * second);
    }
    public static double division(double first, double second){ //divide
        return(first / second);
    }
}



