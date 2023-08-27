package me.tousifkhan.codility.countinelements;


import java.util.HashSet;
import java.util.Set;

//https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
public class FrogRiverOne {

    public int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<A.length; i++) {
            set.add(A[i]);
            if (set.size() == X) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        System.out.println(frogRiverOne.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }
}
