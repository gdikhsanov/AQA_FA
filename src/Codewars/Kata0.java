package Codewars;

class Kata0 {
    public static String countingSheep(int num) {
        //Add your code here
        StringBuilder str = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            str.append(i).append(" sheep...");
        }

        return str.toString();
    }

    public static void main(String[] args) {
        System.out.print(countingSheep(3));

    }
}