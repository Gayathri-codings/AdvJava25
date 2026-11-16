package com.demo.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class LamdaForBiVariants {
    static void main() {
        BiFunction<Integer,Integer,Integer> adder =(Integer n1, Integer n2) -> n1+n2;
        System.out.println(adder.apply(10,20));

        BiConsumer<String, String> obj=(String s1, String s2) -> System.out.println( s1 + "" + s2);
        obj.accept("java","Training");
    }
}


//this is example for BiVariants.
