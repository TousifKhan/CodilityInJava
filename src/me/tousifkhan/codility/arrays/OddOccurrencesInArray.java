package me.tousifkhan.codility.arrays;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: A) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        return map.entrySet().stream()
                .filter(e -> e.getValue().equals(1))
                .findFirst().get().getKey();
    }

    public static void main(String[] args) {
        OddOccurrencesInArray inArray = new OddOccurrencesInArray();
        System.out.println(inArray.solution(new int[] {9,3,9,3,9,7,9}));
    }
}

