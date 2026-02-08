import java.util.*;
import java.util.stream.*;

public class Main {
    static class Employee {
        int id;
        String name;
        String department;
        double salary;

        Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        int getId() { return id; }
        String getName() { return name; }
        String getDepartment() { return department; }
        double getSalary() { return salary; }
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee(1, "Alice", "Engineering", 90000),
            new Employee(2, "Bob", "Engineering", 85000),
            new Employee(3, "Charlie", "Engineering", 75000),
            new Employee(4, "David", "HR", 82000),
            new Employee(5, "Eva", "Engineering", 120000),
            new Employee(6, "Frank", "HR", 95000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
                .filter(e -> "Engineering".equals(e.department))
                .filter(e -> e.salary > 80000)
                .sorted((a, b) -> Double.compare(b.salary, a.salary))
                .collect(Collectors.groupingBy(
                        e -> e.department,
                        Collectors.averagingDouble(e -> e.salary)
                ));

        avgSalaryByDept.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
