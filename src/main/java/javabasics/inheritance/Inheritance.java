package javabasics.inheritance;

public class Inheritance {
//    Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
//1 - method of parent class by object of parent class
//2 - method of child class by object of child class
//3 - method of parent class by object of child class

}

class Parent {
    void m1() {
        System.out.println("This is parent class");
    }

    void m3() {
        System.out.println("This is m3 class");
    }
}

class Child extends Parent {
    void m1() {
        System.out.println("This is child class");
    }

    void m2() {
        System.out.println("This is child class");
    }

    public static void main(String[] args) {
//        Parent p=new Parent();
//        p.m1();
//        Child c=new Child();
//        c.m1();
//        c.m2();

//        Parent p1=new Child();//over-ridden methods(chilc)+parent class methods
//        p1.m1();
//        p1.m3();

        //child ka reference kabhi v parent ke object ko refer nhi kr skta
        //claascastexception
        Child c = (Child) new Parent();
        c.m1();
        c.m2();
        c.m3();
    }
}
