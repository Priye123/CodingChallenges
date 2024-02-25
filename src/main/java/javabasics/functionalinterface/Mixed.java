package javabasics.functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Mixed {
    public static void main(String[] args) {
        //T-> argument,R-> return
        //Predicate<T> ->  test() ->boolean
        //BiPredicate<T,T>
//        BiPredicate<Integer, Integer> pr = (a, b) -> {
//            if (a > b) {
//                return true;
//            } else {
//                return false;
//            }
//        };
//        BiPredicate<Integer, Integer> pr = (a, b) -> a > b;
//        System.out.println(pr.test(10, 20));

        Predicate<Integer> pr = a -> a % 2 == 0;
        System.out.println(pr.test(2));
        //even number -> print "I got even"
        //odd number print "I got odd"

        //Function<T,R>     apply() -> any value

        //int a[]={1,3,6,7,9};
        //print array elements
        //Consumer<T>     accept()->void

    }
}
