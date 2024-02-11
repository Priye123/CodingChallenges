package javabasics.codingquestions;

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
        Employee emp = new Employee("Ram", 10, 3);
        //return name of employee if salary>5 & exp<5
//        if (emp.salary > 5 && emp.exp < 5) {
//            System.out.println(emp.name);
//        }

//        for(Student s:st){
//
//        }

        //{
//            if (e.salary > 5 && e.exp < 5) {
//                return true;
//            } else {
//                return false;
//            }

        //}


        Predicate<Employee> pr = e -> e.salary > 5 && e.exp < 5;
        if (pr.test(emp)) {
            System.out.println(emp.name);
        }
    }
}
