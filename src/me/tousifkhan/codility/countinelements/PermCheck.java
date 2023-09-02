package me.tousifkhan.codility.countinelements;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
public class PermCheck {

    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: A) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        Map<Integer, Integer> sorted = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        int val = sorted.get(sorted.size()-1);
        return map.size() < val ? 0: 1;
    }

    public static void main(String[] args) {
        PermCheck permCheck = new PermCheck();
        System.out.println(permCheck.solution(new int[] {4,2,1}) == 1);
    }
}
