package com.academy.belousova.lesson19;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Map<String, Set<Integer>> initialMap = new HashMap<>() {{
            put("123", Set.of(1, 2, 3, 4));
            put("234", Set.of(2, 3, 4, 5));
            put("345", Set.of(3, 4, 5, 6));
            put("456", Set.of(4, 5, 6, 7));
        }};

        Map<Integer, Set<String>> result = new HashMap<>();
        for (Map.Entry<String, Set<Integer>> entry : initialMap.entrySet()) {
            for (Integer value : entry.getValue()) {
                Set<String> set = result.get(value);
                if (set == null) {
                    set = new HashSet<String>();
                    result.put(value, set);
                }
                set.add(entry.getKey());
            }
        }
        System.out.println("result1 = " + result);


        Map<Integer, Set<String>> result2 =
                initialMap.entrySet().
                        stream().
                        collect(HashMap::new,
                                (m, e) -> e.getValue().forEach(v ->
                                        m.computeIfAbsent(v, ignore -> new HashSet<>())
                                                .add(e.getKey())), (m1, m2) ->
                                        m2.forEach((key, value) ->
                                                m1.merge(key, value, (s1, s2) -> {       // merge объединение, слияние
                                                    s1.addAll(s2);
                                                    return s1;
                                                })));

        System.out.println("result2 = " + result2);
    }
}

























