package com.codility;

public class OddOccurrencesInArray02 {
    int counter;
    public int solution(int[] A) {
        int result=-1;
        for (int element : A) {
            counter = 0;
            for (int element2 : A) {
                if (element == element2) counter++;
            }
            if (counter==1) {
                result=element;
                break;
            }
            else if (counter%2!=0) result=element;
        }
        return result;
    }
}
