package Codewars;

public class Kata {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        int f1 = fighter1.health;
        int f2 = fighter2.health;
        String winner = null;

        if (firstAttacker.equals(fighter1.name)) {

            while (f1 > 0 || f2 > 0) {

                f2 -= fighter1.damagePerAttack;
                System.out.print(fighter1.name + " attacks " + fighter2.name + "; " + fighter2.name + " now has " + f2 + " health");
                if (f2 <= 0) {
                    System.out.println(" and is dead. " + fighter1.name + " wins.");
                    winner = fighter1.name;
                    break;
                }
                else {
                    System.out.println(".");
                }

                f1 -= fighter2.damagePerAttack;
                System.out.print(fighter2.name + " attacks " + fighter1.name + "; " + fighter1.name + " now has " + f1 + " health");
                if (f1 <= 0) {
                    System.out.println(" and is dead. " + fighter2.name + " wins.");
                    winner = fighter2.name;
                    break;
                }
                else {
                    System.out.println(".");
                }
            }

            return winner;
        }
        else {
            while (f1 > 0 || f2 > 0) {

                f1 -= fighter2.damagePerAttack;
                System.out.print(fighter2.name + " attacks " + fighter1.name + "; " + fighter1.name + " now has " + f1 + " health");
                if (f1 <= 0) {
                    System.out.println(" and is dead. " + fighter2.name + " wins.");
                    winner = fighter2.name;
                    break;
                }
                else {
                    System.out.println(".");
                }

                f2 -= fighter1.damagePerAttack;
                System.out.print(fighter1.name + " attacks " + fighter2.name + "; " + fighter2.name + " now has " + f2 + " health");
                if (f2 <= 0) {
                    System.out.println(" and is dead. " + fighter1.name + " wins.");
                    winner = fighter1.name;
                    break;
                }
                else {
                    System.out.println(".");
                }
            }
            return winner;
        }
    }

    public static void main(String[] args) {
        declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew");
    }

}