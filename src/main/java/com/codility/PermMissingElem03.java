package com.codility;

public class PermMissingElem03 {
    public int solution(int[] A){
        int result = -1;
        int[] resultArr = new int[A.length+2];
        for(int i=0;i<A.length;i++){
            resultArr[A[i]]=-1;
        }
        for(int i=1;i<resultArr.length;i++){
            if(resultArr[i]!=-1){
                result=i;
                break;
            }
        }
        return result;
    }
}
