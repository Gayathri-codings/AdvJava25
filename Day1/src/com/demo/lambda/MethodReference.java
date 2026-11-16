package com.demo.lambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {
    static void main() {
        Consumer<String> printer = (string)-> System.out.println(string);
        printer.accept("hi");

        Consumer<String> printer2 =System.out::println;
        printer2.accept("hello");

        Consumer<String> printer3 =MessagePrinter::print;
        printer3.accept("welcome");

        MessagePrinter mp = new MessagePrinter();
        Consumer<String> printer4 =mp::printAnother;
        printer4.accept("hai hai");

        Function<String, String> stringData = String::new;


    }
}

class MessagePrinter{
    public static void print(String s){
        System.out.println(s);
    }

    public void printAnother(String s){
        System.out.println(s);
    }
}


//for static methods we need to use method referrence. but for non static ref we need to use