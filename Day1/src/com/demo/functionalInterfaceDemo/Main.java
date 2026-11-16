package com.demo.functionalInterfaceDemo;

public class Main {
    static void main() {
        Calculator add = (a,b) -> a+b;
        Calculator multiple = (a,b) -> a*b;
        System.out.println(add.calculate(10,20));
        System.out.println(multiple.calculate(10,20));
    }
}
