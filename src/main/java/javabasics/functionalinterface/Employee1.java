package javabasics.functionalinterface;


import java.util.function.Consumer;

class Employee1 {
    String name;
    int salary;
    int exp;

    public Employee1(String name, int salary, int exp) {
        this.name = name;
        this.salary = salary;
        this.exp = exp;
    }

    public static void main(String[] args) {
        Employee1 emp[] = new Employee1[5];

        emp[0] = new Employee1("Raman", 20000, 27);
        emp[1] = new Employee1("Jack", 45000, 31);
        emp[2] = new Employee1("mickey", 15000, 23);
        emp[3] = new Employee1("Tom", 31500, 29);
        emp[4] = new Employee1("Om", 23000, 28);

        Consumer<Employee1> c = e -> {
            //System.out.println("-----------------");
            System.out.println(e.name);
            System.out.println(e.salary);
            System.out.println(e.exp);
            System.out.println("------------------");
        };

        for (Employee1 e : emp) {
            c.accept(e);
        }

    }
}

