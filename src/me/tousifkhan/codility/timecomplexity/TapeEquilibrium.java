package me.tousifkhan.codility.timecomplexity;

import java.util.Arrays;
import java.util.stream.IntStream;

//https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
public class TapeEquilibrium {

    public int solutions(int[] A) {
        int minDiff = Integer.MIN_VALUE;
        int leftSum = 0;
        int rightSum = 0;
        for(int i=1; i < A.length; i++) {
            int [] leftArray = Arrays.copyOfRange(A, 0,i+1);
            int [] rightArray = Arrays.copyOfRange(A, i+1, A.length);
            leftSum = IntStream.of(leftArray).sum();
            rightSum = IntStream.of(rightArray).sum();
            int diff = Math.abs(leftSum - rightSum);
            if (minDiff == Integer.MIN_VALUE) {
                minDiff = diff;
            }
            if (minDiff > diff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        System.out.println(tapeEquilibrium.solutions(new int[] {3,1,2,4,3}));
    }
}
