package com.codility;

public class BinaryGap {
    public int solution(int N) {
        int result = 0;
        int gap = 0;
        String binaryRepresentationString = Integer.toBinaryString(N);
        int start = binaryRepresentationString.indexOf('1');
        for (int i = start; i < binaryRepresentationString.length(); i++) {
            if (binaryRepresentationString.charAt(i) == '0') gap++;
            if (binaryRepresentationString.charAt(i) == '1' && gap > result) {
                result = gap;
                gap = 0;
            }
        }
        return result;
    }
}