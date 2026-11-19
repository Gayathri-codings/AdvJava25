package com.demo;

import java.util.Objects;

public class Employee {
    int employeeID;
    String name;
    String email;
    String department;
    String designation;
    Double Salary;

    public Employee(int employeeID, String name, String email, String department, String designation, Double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.email = email;
        this.department = department;
        this.designation = designation;
        Salary = salary;
    }

    public Employee() {

    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeID == employee.employeeID && Objects.equals(name, employee.name) && Objects.equals(email, employee.email) && Objects.equals(department, employee.department) && Objects.equals(designation, employee.designation) && Objects.equals(Salary, employee.Salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID, name, email, department, designation, Salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
