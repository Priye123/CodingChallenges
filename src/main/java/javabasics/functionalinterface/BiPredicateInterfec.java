package javabasics.functionalinterface;

import com.google.common.util.concurrent.Callables;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class BiPredicateInterfec {
    public static void main(String[] args) {
//        BiPredicate<Integer, Integer> pr = (a, b) -> a > 0 && b > 0;
//        System.out.println(pr.test(1, -1));
//        BiFunction<Integer, Integer, String> br = (a, b) -> "Hello";
//        System.out.println(br.apply(10,20));
        Function<Integer, Integer> f1 = n -> n * 2;
        Function<Integer, Integer> f2 = n -> n * n * n;
        //andThen()
       // System.out.println(f1.andThen(f2).apply(2));
        //System.out.println(f2.apply(f1.apply(2)));
        System.out.println(f1.compose(f2).apply(2));


//        int a = f1.apply(2);
//        int b = f2.apply(a);
//        System.out.println(b);


    }
}
