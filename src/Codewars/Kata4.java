package Codewars;

public class Kata4
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
        if (input == null || input.length == 0) {
            return new int[0];
        }
        int pos = 0;
        int sumNeg = 0;

        for (int i:input
             ) {
            if (i > 0) {
                pos++;
            } else if (i < 0) {
                sumNeg+= i;
            }
        }
        return new int[]{pos, sumNeg};
    }
}
