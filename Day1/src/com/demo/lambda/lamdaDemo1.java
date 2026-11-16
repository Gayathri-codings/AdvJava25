package com.demo.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class lamdaDemo1 {
    static void main() {
        EvenChecker e =  new EvenChecker();
        System.out.println(e.test(22));

        //Below class code can be rewritten like this
        Predicate<Integer> isEven = (Integer integer)-> integer.intValue()%2==0;
        System.out.println(isEven.test(21));

        Consumer<String> m = (String s)-> System.out.println(s);
        m.accept("hello consumer demo");

        Supplier<String> greetSupplier=() -> "Good Evening";
        System.out.println(greetSupplier.get());

        Function<String, String> decoratedGreat =(String msg) ->"Hello there  "+msg;
        System.out.println(decoratedGreat.apply("ha"));
    }
}
class EvenChecker implements Predicate<Integer>{
    @Override
    public boolean test(Integer integer) {
        return integer.intValue()%2==0;
    }
}
