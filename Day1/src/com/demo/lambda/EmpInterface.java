package com.demo.lambda;

@FunctionalInterface
public interface EmpInterface {
    Employee create(int id, String name);
}
