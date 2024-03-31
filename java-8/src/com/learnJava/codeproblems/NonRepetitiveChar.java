package com.learnJava.codeproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepetitiveChar {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";

        String[] inputArray = input.split("");

        Map<String, Integer> itemMap = Arrays
                .stream(inputArray)
                .collect(Collectors.toMap( k -> k, v-> 1, (e, r) -> e + 1, HashMap::new));


       /* System.out.println(itemMap
                .entrySet()
                .stream()
                .filter(v -> v.getValue() <= 1)
                .map( k -> k.getKey())
                .findFirst()
                .get());*/


        System.out.println("###  : "+input
                .chars()
                .mapToObj((s) -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy((i) -> i,LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1L)
                .map(e -> e.getKey())
                .findFirst()
                .get());



    }
}
