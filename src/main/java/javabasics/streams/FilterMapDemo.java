package javabasics.streams;

import javabasics.functionalinterface.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapDemo {
    String name;
    int salary;
    int exp;

    public FilterMapDemo(String name, int salary, int exp) {
        this.name = name;
        this.salary = salary;
        this.exp = exp;
    }

    public static void main(String[] args) {
        FilterMapDemo emp[] = new FilterMapDemo[5];

        emp[0] = new FilterMapDemo("Raman", 20000, 27);
        emp[1] = new FilterMapDemo("Jack", 45000, 31);
        emp[2] = new FilterMapDemo("mickey", 15000, 23);
        emp[3] = new FilterMapDemo("Tom", 31500, 29);
        emp[4] = new FilterMapDemo("Om", 23000, 28);

        //Arrays.stream(emp).filter(e -> e.salary > 20000).forEach(e -> System.out.println(e.name));
        //5%+orignal sal-->empname -->updated salary
        List<Double> es = Arrays.stream(emp).map(e -> e.salary * 0.05 + e.salary).collect(Collectors.toList());
        System.out.println(es);
        int i = 0;
        for (FilterMapDemo e : emp) {
            System.out.println(e.name + " " + es.get(i));
            i++;
        }

    }
}


