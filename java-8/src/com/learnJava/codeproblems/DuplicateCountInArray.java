package com.learnJava.codeproblems;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCountInArray {
    public static void main(String[] args) {


        Integer[] x = {1, 2, 3, 4 , 5, 1, 2, 3, 4, 1};

      /*  Map<Integer, Integer> itemMap = Arrays.stream(x)
                .collect(Collectors.toMap(key -> key, value -> 1, (existing, replacement) -> existing + 1, HashMap::new));

        itemMap
                .entrySet()
                .stream()
                .filter(v -> v.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        itemMap.forEach((key, value) -> System.out.println( key + "****" + value));*/


        System.out.println(Arrays.stream(x)
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));






    }


}
