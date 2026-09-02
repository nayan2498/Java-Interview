import java.util.Comparator;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class HighestSalaryEmployee {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "John", 50000),
                new Employee(2, "Alice", 80000),
                new Employee(3, "Bob", 70000));

        Employee employee = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .findFirst()
                .orElse(null);

        System.out.println(employee.getName() + " " + employee.getSalary());
    }
}
