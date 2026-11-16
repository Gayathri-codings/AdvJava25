package com.demo.lambda;

public class Constructorref {
    static void main() {
        EmpInterface emp =(id,name) ->new Employee(id,name);
        emp.create(100,"GM");

        //can be created like below also. it is a constructor reference
        EmpInterface emp1=Employee::new;
        emp1.create(200,"CHN");
    }
}
