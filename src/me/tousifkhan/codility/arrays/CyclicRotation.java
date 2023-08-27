package me.tousifkhan.codility.arrays;

import java.util.Arrays;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        if (A.length == K) return A;
        int reminder = K > A.length ? K % A.length: K;
        int[] leftArray = Arrays.copyOfRange(A, 0, reminder-1);
        int[] rightArray = Arrays.copyOfRange(A, reminder-1, A.length);
        for (int num: leftArray) {
            rightArray = addElement(rightArray, num);
        }
        return rightArray;
    }

    int[] addElement(int[] a, int element) {
        a = Arrays.copyOf(a, a.length+1);
        a[a.length-1] = element;
        return a;
    }

    public static void main(String[] args) {
        CyclicRotation rotation = new CyclicRotation();
        System.out.println(rotation.solution(new int[] {3, 8, 9, 7, 6}, 3));
    }
}
