package Java8features.streams;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeRunner {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("harsh", LocalDate.of(1990, 5, 15), 60000));
        employees.add(new Employee("arun", LocalDate.of(1985, 8, 25), 50000));
        employees.add(new Employee("deva", LocalDate.of(1995, 3, 10), 56000));
        employees.add(new Employee("deva", LocalDate.of(1995, 3, 10), 70000));


        Stream<Employee> filteredEmployees = employees.stream()
                .filter(e -> e.getBirthDate().isAfter(LocalDate.of(1990, 1, 1)));
        List<Employee> ListEmployees = filteredEmployees.collect(Collectors.toList());

        System.out.println("Employees born after 1990:");
        ListEmployees.forEach(System.out::println);

        double totalSalary = employees.stream()
                .mapToDouble(Employee::getSalary).sum();

        System.out.println("Total salary of all employees: " + totalSalary);

        System.out.println("maximum salary of employees:");
        Optional<Double> maxSalary = employees.stream().map(Employee::getSalary).max(Double::compareTo);
        maxSalary.ifPresent(System.out::println);

        System.out.println("minimum salary of employees:");
        Optional<Double> minSalary = employees.stream().map(Employee::getSalary).min(Double::compareTo);
        minSalary.ifPresent(System.out::println);

        System.out.println("Total employees:");
        long numberOfEmployees = employees.stream().count();
        System.out.println(numberOfEmployees);

        System.out.println("Repeated Employees removed:");
        Stream<Employee> distinct = employees.stream().distinct();
        distinct.forEach(System.out::println);
        //stream is used we can't reuse the stream again it will throw  error
//        distinct.forEach(System.out::println);

        System.out.println("Sorted Order Of Employees:");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName).thenComparingDouble(Employee::getSalary))
                .forEach(System.out::println);

        System.out.println("Changing The Names into cps:");
        Stream<String> employeeName = employees.stream().map(employee -> employee.getName().toUpperCase());
        employeeName.forEach(System.out::println);

        System.out.println("Limit Method using  :");
        Stream<Employee> limit = employees.stream().limit(2);
        limit.forEach(System.out::println);

        System.out.println("with using aarray:");
        for (Object employee : employees.toArray()) {
            System.out.println(employee);
        }

        System.out.println("matching letters object: ");
        boolean present = employees.stream().anyMatch(empploe -> empploe.getName().startsWith("h"));
        System.out.println("present"+ present);
    }


    }
