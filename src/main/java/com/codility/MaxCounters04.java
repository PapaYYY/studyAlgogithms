package com.codility;

public class MaxCounters04 {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int max = 0;
        int maxarr = 0;
        for (int counter : A) {
            if (counter <= N) {
                result[counter - 1]++;
                if (result[counter - 1] > max) max = result[counter - 1];
            } else {
                result = new int[N];
                maxarr += max;
                max = 0;
            }
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = result[i] + maxarr;
        }
        return result;
    }
}
