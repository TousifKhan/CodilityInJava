package me.tousifkhan.codility.timecomplexity;

import java.util.Arrays;

public class PermMissingElem {

    /*
    This method don't work when we have duplicate element in array
     */
    public int solution1(int[] A) {
        long actualSum = 0;
        for (int number: A) {
            actualSum += number;
        }
        long maxNumber = A.length + 1;
        long expectedSum = (maxNumber * (maxNumber + 1) / 2);
        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {
        System.out.println(new PermMissingElem().solution(new int[]{1, 5, 2, 3, 5}));
        System.out.println(new PermMissingElem().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println(new PermMissingElem().solution(new int[]{-1, -2}));
    }

    public int solution(int[] A) {
        int previousNum = Integer.MIN_VALUE;
        Arrays.sort(A);
        for (int num: A) {
            if (previousNum != Integer.MIN_VALUE && num != previousNum+1) {
                return previousNum+1;
            }
            previousNum = num;
        }
        return previousNum >=0 ? previousNum+1: 1;
    }
}
