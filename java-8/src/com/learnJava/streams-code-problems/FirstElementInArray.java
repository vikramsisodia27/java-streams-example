package com.learnjava.streams;

import java.util.Arrays;
import java.util.List;

public class FirstElementInArray {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().findFirst().ifPresent(System.out::println);

    }
}
