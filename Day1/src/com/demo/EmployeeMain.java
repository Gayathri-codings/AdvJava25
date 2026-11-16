package com.demo;

public class EmployeeMain {
    static void main() {
        Employee emp = new Employee(1,"abc","asb", 3000);
        System.out.println(emp);
        Employee emp1 = new Employee(1,"abc","asb", 3000);
        System.out.println(emp==emp1); //it is returning object reference ae equal or not
        System.out.println(emp.equals(emp1)); // it returns objects are same or not
        System.out.println(emp.hashCode()==emp1.hashCode()); // it returns objects hashcode are same or not
    }
}
