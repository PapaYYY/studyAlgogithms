package com.codility;

import java.util.Arrays;

public class MaxCounters04 {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int max = 0;
        for (int counter : A) {
            if (counter <= N) {
                result[counter - 1]++;
                if (result[counter - 1] > max) max = result[counter - 1];
            } else Arrays.fill(result, max);
        }
        return result;
    }
}
