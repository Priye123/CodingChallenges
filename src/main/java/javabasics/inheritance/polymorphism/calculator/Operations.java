package javabasics.inheritance.polymorphism.calculator;

public class Operations implements Calculator {
    @Override
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    @Override
    public void subtract(int a, int b) {
        System.out.println(a - b);
    }

    @Override
    public void multiply(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public static void main(String[] args) {
        Operations o=new Operations();
        o.add(2,5);
    }
}
