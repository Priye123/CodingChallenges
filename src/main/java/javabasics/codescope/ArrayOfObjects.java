package javabasics.codescope;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Employee {
    String name;
    double salary;
    String doj;

    public Employee(String name, double salary, String doj) {
        this.name = name;
        this.salary = salary;
        this.doj = doj;
    }

    Employee() {

    }
}


public class ArrayOfObjects {
    //    Write a program to print the name, salary and date of joining of 100 employees in a company.
//    Use array of objects.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Employee emp1 = new Employee(sc.next(), sc.nextDouble(), sc.next());
        //Date class will give complete information.
//        Date date=new Date();
//        System.out.println(date);
        //we can format the date using SimpleDateFormat class.
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//        Date date = new Date();
//        String actualDate = format.format(date);
//        System.out.println(actualDate);

//        Employee emp1 = new Employee("Rahul", 20.6, "26/10/2019");
//        Employee emp2 = new Employee("Subhakant", 22.7, "26/10/2017");
//        Employee emp3 = new Employee("Sameer", 18.6, "16/09/2020");
//        Employee emp4 = new Employee("Priye", 17.8, "13/06/2021");
//        Employee emp5 = new Employee("Daya", 19.2, "12/07/2009");
//
//        System.out.println(emp1.name+" "+emp1.salary+" "+emp1.doj);


        Employee emp[] = new Employee[2];//array of employee

        for (int i = 0; i < emp.length; i++) {
            emp[i] = new Employee(sc.next(), sc.nextDouble(), sc.next());
//            emp[i].name = sc.next();
//            emp[i].salary = sc.nextDouble();
//            emp[i].doj = sc.next();
        }

        for (Employee e : emp) {
            System.out.println(e.name + " " + e.salary + " " + e.doj);
        }

//        for (int i = 0; i < emp.length; i++) {
//            System.out.println(emp[i].name + " " + emp[i].salary + " " + emp[i].doj);
//        }
//        int i = 0;
//        for (Employee e : emp) { not possible to take input from user by for-each loop
//            emp[i] = new Employee();
//            e.name = sc.next();
//            e.salary = sc.nextDouble();
//            e.doj = sc.next();
//            i++;
//        }

        //System.out.println(emp[4].name + " " + emp[4].salary + " " + emp[4].doj);


//        int a[] = {1, 2, 3, 4, 5, 6, 7};
//        int m[] = new int[5];
//        Employee e[] = new Employee[5];//Employee is user defined datatype(name,salary,doj)
//        Employee s=new Employee();
//        s.name,s.salary,s.doj

//        for (Employee s : e) {
//
//        }

//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }

//        for (int x : a) { //x:- array ka value, a:- array ka name
//            System.out.println(x);
//        }

    }
}
