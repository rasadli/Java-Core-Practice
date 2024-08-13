package week12.employee;

import java.util.Arrays;

public class SortWithLambdas {
    public static void main(String[] args) {
        
        Employee[] employees = {
            new Employee("Rashad", 19, 1000.0),
            new Employee("Javid", 33, 1400.0),
            new Employee("Omar", 20, 300.0),
            new Employee("Farid", 32, 100.0)
        };

        //Sort by first name
        Arrays.sort(employees, (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
        System.out.println("Sorted by the first name: ");
        Arrays.stream(employees).forEach(System.out::println);

        //Sort by age
        Arrays.sort(employees, (e1, e2) -> e1.getAge().compareTo(e2.getAge()));
        System.out.println("\nSorted by the age: ");
        Arrays.stream(employees).forEach(System.out::println);

        //Sort by salary
        Arrays.sort(employees, (e1, e2) -> e1.getSalary().compareTo(e2.getSalary()));
        System.out.println("\nSorted by the salary: ");
        Arrays.stream(employees).forEach(System.out::println);
    }
}
