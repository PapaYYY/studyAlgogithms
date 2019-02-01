package com.codility;

public class TapeEquilibrium03 {
    public int solution(int[] A){
        int[] s1 = new int[A.length-1];
        int[] s2 = new int[A.length-1];
        int result;
        int tmp;
        s1[0]=A[0];
        s2[A.length-2]=A[A.length-1];
        for(int i=2; i<A.length; i++){
            s1[i-1]=s1[i-2]+A[i-1];
        }
        for(int i=A.length-2; i>0; i--){
            s2[i-1]=s2[i]+A[i];
        }

        result = Math.abs(s1[0]-s2[0]);
        for(int i=1; i<s1.length; i++){
            tmp = Math.abs(s1[i]-s2[i]);
            if(tmp<result) result=tmp;
        }
        return result;
    }
}
