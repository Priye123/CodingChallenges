package javabasics.functionalinterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class Employee {
    String name;
    int salary;
    int exp;

    public Employee(String name, int salary, int exp) {
        this.name = name;
        this.salary = salary;
        this.exp = exp;
    }

    public static void main(String[] args) {
        Employee emp[] = new Employee[5];

        emp[0] = new Employee("Raman", 20000, 27);
        emp[1] = new Employee("Jack", 45000, 31);
        emp[2] = new Employee("mickey", 15000, 23);
        emp[3] = new Employee("Tom", 31500, 29);
        emp[4] = new Employee("Om", 23000, 28);

        //sal>20000,return name
        Predicate<Employee> pr = es -> es.salary > 20000;
        Function<Employee, String> f = e -> {
            if (pr.test(e)) {
                return e.name;
            } else {
                return null;
            }
        };

        for (Employee employee : emp) {
            String name = f.apply(employee);
            if (name != null) {
                System.out.println(f.apply(employee));
            }
        }
    }
}

