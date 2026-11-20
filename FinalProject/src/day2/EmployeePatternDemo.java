package day2;

import day2.records.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import static day2.records.Data.employees;

public class EmployeePatternDemo {
    static void main() {
 IO.println("All Employees");
        employees.stream().forEach(System.out::println);

        List<Employee> sortedByNameDesc = employees.stream()
                .sorted(Comparator.comparing(Employee::name).reversed())
                .collect(Collectors.toList());

        System.out.println("Sorted by Name (Descending):");
        sortedByNameDesc.forEach(System.out::println);

        List<Employee> sortedBySalDesc = employees.stream()
                .sorted(Comparator.comparing(Employee::salary).thenComparing(Employee::department).reversed())
                .collect(Collectors.toList());

        System.out.println("Sorted by Salary by department wise (Descending):");
        sortedBySalDesc.forEach(System.out::println);

     Optional<Employee> top  =  employees.stream().max(Comparator.comparingDouble(Employee::salary));
     top.ifPresent(e->IO.println("High Salary: "+e.salary()));

        Double minSal = employees.stream().mapToDouble(Employee::salary).min().getAsDouble();
     IO.println("MIN SAL: "+minSal);

     long empCount= employees.stream().map(Employee::name).count();
        IO.println("Total Emp: "+empCount);
//        IO.println(highSal);
    }
}
