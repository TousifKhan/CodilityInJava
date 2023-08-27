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

    public int[] solution2(int[] A, int K) {
        if (A.length == K) return A;
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[(i + K) % A.length] = A[i];
        }
        return result;
    }

    public static void main(String[] args) {
        CyclicRotation rotation = new CyclicRotation();
        Arrays.stream(rotation.solution(new int[] {3, 8, 9, 7, 6}, 3)).forEach(System.out::println);
        Arrays.stream(rotation.solution2(new int[] {3, 8, 9, 7, 6}, 3)).forEach(System.out::println);
    }
}
