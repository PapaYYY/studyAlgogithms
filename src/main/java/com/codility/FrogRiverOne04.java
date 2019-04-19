package com.codility;

public class FrogRiverOne04 {
    public int solution(int x, int[] A) {
        int[] river = new int[x];
        int before;
        for (int i = 0; i < A.length; i++) {
            before = river[A[i] - 1];
            river[A[i] - 1]++;
            if (before == 0) x--;
            if (x == 0) return i;
        }
        return -1;
    }
}
