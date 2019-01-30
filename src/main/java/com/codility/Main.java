package com.codility;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // System.out.println(new BinaryGap().solution(32));
        //  int[] arr = {3, 9, 3, 9, 3, 7, 3};
        // System.out.println(new OddOccurrencesInArray02().solution(arr));
        int[] arr = {3, 8, 9, 7, 6};
        System.out.println(Arrays.toString(new CyclicRotation02().solution(arr, 3)));
    }
}


