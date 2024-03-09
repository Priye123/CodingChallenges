package javabasics.streams;

import java.util.Arrays;
import java.util.List;

public class MapDemo {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        l.stream().map(n -> n + 2) // 3,4,5,6,7
                .forEach(n -> System.out.println(n));

        List<String> names = Arrays.asList("Ram", "Mohan", "Shyam", "Pahalwan");
//        names.stream().map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));
    }

}
