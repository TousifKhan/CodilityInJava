package me.tousifkhan.codility.timecomplexity;

import java.util.Arrays;
import java.util.stream.IntStream;

//https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
public class TapeEquilibrium {

    public int solution(int[] A) {
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

    /***
     * Another approach
     * @param A as array
     * @return int
     */
    public int solution2(int[] A) {
        int leftSum = A[0];
        int rightSum = 0;
        for (int n: A) {
            rightSum +=n;
        }
        rightSum -= leftSum;

        int diff = Math.abs(leftSum - rightSum);
        for (int i = 1; i < A.length; i++) {
            leftSum+=A[i];
            rightSum-=A[i];
            int currentDiff = Math.abs(leftSum - rightSum);
            if (diff > currentDiff) diff = currentDiff;
        }
        return diff;
    }

    public static void main(String[] args) {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        System.out.println(tapeEquilibrium.solution2(new int[] {3,1,2,4,3}));
    }
}
