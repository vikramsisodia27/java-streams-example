package com.learnJava.codeproblems;

import java.util.Arrays;
import java.util.List;

public class MaxNumberInArray {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println(myList.stream().max((Integer::compare)));

    }
}
