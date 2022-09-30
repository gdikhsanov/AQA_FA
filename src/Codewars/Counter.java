package Codewars;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you

        int n = 0;

        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null && arrayOfSheeps[i]){
                n++;
            }
        }
        return n;
    }
}