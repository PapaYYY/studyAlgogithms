package com.codility;

public class PermCheck04 {
    public int solution(int[] A) {
        int max = 0;
        for (int i : A) if (i > max) max = i;

        int[] B = counting(A, max);

        for (int i = 1; i < B.length; i++) {
            if (B[i] != 1) return 0;
        }
        return 1;
    }

    private int[] counting(int[] input, int resultSize) {
        int[] result = new int[resultSize + 1];
        for (int i : input) {
            result[i]++;
        }
        return result;
    }
}
