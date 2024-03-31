package com.learnjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingNumberWithOne {
    public static void main(String[] args) {
        List<Integer> ml = Arrays.asList(10,15,8,49,25,98,32);

        List<Integer> cList = ml.stream().map( i -> String.valueOf(i)).filter( (i) -> i.startsWith("1")).map( i -> Integer.valueOf(i)).collect(Collectors.toList());

        System.out.println(cList);


    }



}
