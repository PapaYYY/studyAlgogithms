package com.codility;

import java.util.Arrays;

public class CyclicRotation02 {
    public int[] solution(int[] A, int K) {
        int[] B = new int[A.length];
        for (int i = 0; i < K; i++) {
            int tail = A[A.length - 1];
            for (int j = 0; j < A.length - 1; j++) {
                B[j + 1] = A[j];
            }
            B[0] = tail;
            A = Arrays.copyOf(B, B.length);
        }
        return B;
    }
}
