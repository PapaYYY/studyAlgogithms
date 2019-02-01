package com.codility;

public class FrogJump03 {
    public int solution(int x, int y, int d){
        int jumps;
        if((y-x)%d==0) jumps = (y-x)/d;
        else jumps = Math.round(((y-x)/d)+1);
        return jumps;
    }
}
