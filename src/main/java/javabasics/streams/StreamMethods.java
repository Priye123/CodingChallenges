package javabasics.streams;

import java.util.*;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(2, 4, 1, 3, 7, 5, 9);
//        Collections.sort(l);
//        System.out.println(l);
        //l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //anyMatch() return boolean :- Predicate
        //allMatch()
        //noneMatch()
        List<String> fruits = Arrays.asList(
                "one apple",
                "one mango",
                "two apples",
                "more grapes",
                "two guavas"
        );

        boolean result = fruits.stream().noneMatch(x -> x.startsWith("one"));
        System.out.println(result);



    }
}
