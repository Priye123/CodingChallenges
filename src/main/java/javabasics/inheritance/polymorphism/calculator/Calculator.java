package javabasics.inheritance.polymorphism.calculator;


public interface Calculator {
    //hiding implementation details is called abstraction.
    void add(int a, int b);

    void subtract(int a, int b);

    void multiply(int a, int b, int c);
}
