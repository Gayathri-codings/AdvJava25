package com.demo;

import java.util.Optional;

public class EmployeeServiceImplemetation{
    public static Optional<Department> getEmployee(String name){
        if(name.equals("GM")){
            return Optional.of(new HRDepartment());
        }
            return Optional.empty();
        }

  static void main() {
        EmployeeService empRe=()->
            new Employee(100,"GM","abc@gmail.com","HR","HR",10000.0);
      IO.println(empRe.emploeeRetrive());

      Optional<Department> empDep= EmployeeServiceImplemetation.getEmployee("GM");

      if(empDep.isPresent()) {
          Department dep=empDep.get();
          System.out.println("Employee is in " +dep.empDertment()+" Department");

      }else {
          IO.println("Employee is not there in HR department");
      }

  }
}

