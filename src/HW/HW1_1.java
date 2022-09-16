package HW;

public class HW1_1 {
    public static void main(String[] args){
        char a;
        a=12;
        char b;
        b = 13;

        System.out.println(
                "b=" + (double)(b) + "\n" +
                        "a=" + (int)(a) + "\n" +
                        "a+b=" + (a+b) + "\n" +
                        "a-b=" + (a-b) + "\n" +
                        "a/b=" + (a/b) + "\n" + //почему 0
                        "a*b=" + (a*b) + "\n" +
                        "a%b=" + (a%b) + "\n"); //почему 12
        if (a%2==0){
            System.out.println("a - четное");
        }
        else {
            System.out.println("а - нечетное");
        }
        if (b%2==0){
            System.out.println("a - четное");
        }
        else {
            System.out.println("b - нечетное");
        }
        System.out.println("\uD83D\uDE00"); //UNICODE 16 _NOT for all systems
        System.out.println('☺');


    }

}
