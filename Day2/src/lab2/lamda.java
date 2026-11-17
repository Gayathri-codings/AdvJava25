package lab2;

import dataset.Employee;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static dataset.Data.employees;

public class lamda {
    static void main() {
        System.out.println("hello");
    }


    /*
     Predicate<Integer> isEven= n->n%2==0;
        System.out.println(numList.stream().filter(n->n%2==0).peek(System.out::println).count());


    Consumer<String> m = (String s)-> System.out.println(s);
        m.accept("hello consumer demo");

    Supplier<String> greetSupplier=() -> "Good Evening";
        System.out.println(greetSupplier.get());

    Function<String, String> decoratedGreat =(String msg) ->"Hello there  "+msg;
        System.out.println(decoratedGreat.apply("ha"));*/

}
