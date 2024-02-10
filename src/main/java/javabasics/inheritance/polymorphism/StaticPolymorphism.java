package javabasics.inheritance.polymorphism;

//method overloading
public class StaticPolymorphism {

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void add(double a, String b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        StaticPolymorphism sp = new StaticPolymorphism();
        StaticPolymorphism.add(10, 20);
        sp.add(10, 20, 30);
        sp.add(3.5, "Subhakant");
    }
}
