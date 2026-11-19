package com.demo.patterns;

import com.demo.patterns.records.Employee;

public class RecordInPatternMatching {
    static void main() {
        Employee emp = new Employee("GM", 20000);
        String category = switch(emp){
            case Employee(String name, double salary) when  salary >10000 ->"Mgr";
            case Employee(String name, double salary) when salary <10000 -> "emp";
            default-> "default case";
        };
        System.out.println(category);
    }
}
