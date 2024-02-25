package javabasics.functionalinterface;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<Integer, String> f = n -> {
            if (n % 2 == 0) {
                return "This is even";
            } else {
                return "This is odd";
            }
        };

        String s = f.apply(20);
        System.out.println(s);
    }

    // str= "Rahul", return length of string
    // 5
}
