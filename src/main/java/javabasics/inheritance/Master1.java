package javabasics.inheritance;

//why do we need inheritance?
//Parent class
class Employee {
    int salary = 60000;
}

class Engineer extends Employee {
    int salary = 10000;
    int benfits = 10000;
}

//employee benefits
public class Master1 {

    public static void main(String[] args) {
//        Employee e = new Employee();
//        System.out.println(e.salary);
        //poly:multiple,morhism:-objects

        Engineer s = new Engineer();
        System.out.println(s.salary + " " );
    }

}

