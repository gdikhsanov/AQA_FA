package Codewars;

public class Kata2 {

    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            result.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return result.toString();
    }
}