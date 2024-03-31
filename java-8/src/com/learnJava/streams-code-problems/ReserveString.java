package com.learnjava.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReserveString {
    public static void main(String[] args) {
        String name = "vikram";
        String rname = Stream.of(name).map(n -> new StringBuilder(n).reverse()).collect(Collectors.joining("-","(",")"));
        System.out.println(rname);
    }

}
