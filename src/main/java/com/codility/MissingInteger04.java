package com.codility;

public class MissingInteger04 {
    public int solution(int[] A) {
        int result = 1;
        int min = 0;
        int max = 0;
        int[] count;
        // searching min value in array
        for (int number : A) if (number < min) min = number;
        // transforming array into array of positive integers
        if (min < 0) {
            for (int i = 0; i < A.length; i++) {
                A[i] = A[i] + Math.abs(min);
            }
        }
        // searching max value in transformed array
        for (int number : A) if (number > max) max = number;

        count = new int[max + 2];
        for (int number : A) {
            count[number]++;
        }
        for (int i = 1; i < count.length; i++) {
            if ((count[i] == 0) && ((i + min) > 0)) return i + min;
        }
        return result;
    }
}
