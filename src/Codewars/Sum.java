package Codewars;

public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        //!!!  return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
        int result = 0;
        for (int a1 : arr1
        ) {
            result += a1;
        }
        for (int a2 : arr2
        ) {
            result += a2;
        }

        return result;
    }
}