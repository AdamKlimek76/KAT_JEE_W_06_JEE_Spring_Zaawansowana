package pl.coderslab.advanced.stream.zad2;

import java.time.LocalDate;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee("Andrzej", "Kmicic", 'm', 25, 5000),
                new Employee("Adam", "Kula", 'm', 31, 3500),
                new Employee("Franc", "Nowak", 'm', 42, 6000),
                new Employee("Julia", "Niemir", 'f', 50, 2800),
                new Employee("Elwira", "Klimek", 'm', 48, 3600));

        employees
                .stream()
                .filter(employee -> employee.getLastName().startsWith("N"))
                .forEach(System.out::println);

       // employees
        //        .stream()
        //        .filter(employee -> employee.getLastName().startsWith("N"))
         //       .forEach(System.out::println);

        employees
                .stream()
                .filter(employee -> employee.getAge() > 30)
                .filter(employee -> employee.getAge() < 45)
                .forEach(System.out::println);

        employees
                .stream()
                .filter(employee -> employee.getGender() == 'f')
                .filter(employee -> employee.getSalary() < 3500)
                .filter(employee -> employee.getAge() > 20)
                .filter(employee -> employee.getAge() < 30)
                .map(employee -> {
                    int salary = employee.getSalary() * 2;
                    employee.setSalary(salary);
                    return employee;
                })
                .forEach(System.out::println);


    }


}
