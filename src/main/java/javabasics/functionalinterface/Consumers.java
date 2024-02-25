package javabasics.functionalinterface;

import java.util.function.Consumer;

//Consumer<T>     accept()
public class Consumers {
    public static void main(String[] args) {
        Consumer<String> c = a -> System.out.println(a);
        c.accept("Rahul");
    }
}
