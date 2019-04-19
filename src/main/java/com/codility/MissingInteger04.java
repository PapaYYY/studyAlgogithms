package com.codility;

public class MissingInteger04 {
    public int solution(int[] A) {
        int result = 1;
        int min = 0;
        int max = 0;
        // searching min value in array
        for (int number : A) if (number < min) min = number;
        // transforming array into array of positive integers
        if(min<0) {
            for (int i = 0; i < A.length; i++) {
                A[i] = A[i] + Math.abs(min);
            }
        }
        // searching max value in transformed array
        for (int number : A) if (number > max) max = number;
        int[] count = new int[max+1];
        for (int number : A) {
            count[number]++;
        }
        for (int number : count){
            if(number==0&&(number-min)>0) return number;
        }
        return result;
    }
}
