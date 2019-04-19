package com.codility;

import java.util.Arrays;

public class MaxCounters04 {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int max = 0;
        for (int counter : A) {
            if (counter <= N) {
                result[counter]++;
                if(result[counter]>max) max=result[counter];
            } else Arrays.fill(result, max);
        }
        return result;
    }
}
