package com.codility;

import java.util.Arrays;

public class FrogRiverOne04 {
    public int solution(int x, int[] A) {
        int[] river = new int[x];
        int time=0;
        int before;
        for(int i=0; i<A.length; i++){

            Arrays.toString(river);

            before = river[A[i]];
            river[A[i]]++;
            if(before==0&&river[A[i]]==1) x--;
            if(x==0) return i;
        }
        return -1;
    }

    private int[] counting(int[] input, int resultSize) {
        int[] result = new int[resultSize + 1];
        for (int i : input) {
            result[i]++;
        }
        return result;
    }
}
