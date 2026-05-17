package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();

        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setSalary(5000);
        employee.setDept("Sales");
        employee.setGender("Male");
        employees.add(employee);

        Employee employee1 = new Employee();
        employee1.setFirstName("John");
        employee1.setLastName("Doe");
        employee1.setSalary(4000);
        employee1.setDept("Sales");
        employee1.setGender("Male");
        employees.add(employee1);

        Employee employee2 = new Employee();
        employee2.setFirstName("John");
        employee2.setLastName("Doe");
        employee2.setSalary(4000);
        employee2.setDept("IT");
        employee2.setGender("Female");
        employees.add(employee2);

        int salary = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .findFirst().get().getSalary();

        System.out.println(salary);

        int salary1 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1).findFirst().get().getSalary();

        System.out.println(salary1);


        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDept));

        System.out.println(collect);

        Map<String, Long> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(collect1);


        Map<Integer, List<Employee>> collect2 = employees.stream().collect(Collectors.groupingBy(Employee::getSalary));

        System.out.println(collect2);

        collect2.entrySet().stream().filter(entry -> entry.getValue().size() > 1)
                .forEach(entry -> {

                    System.out.println(entry.getKey());

                    entry.getValue().forEach(emp -> System.out.println("name:" +emp.getFirstName()));
                });


    }
}
