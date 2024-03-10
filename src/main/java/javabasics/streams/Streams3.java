package javabasics.streams;

import java.util.Arrays;
import java.util.List;

public class Streams3 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(2, 4, 1, 3, 7, 5, 9);
        //print sum of odd numbers from 1 to n,n=11(exclusive)
        //1+3+5+7+9=25

        //mapToInt():- not thread safe
        //System.out.println(l.stream().mapToInt(e->e).sum());

       // l.stream().limit(2).skip(1).forEach(System.out::println);

//        List<String> s = Arrays.asList("Ram", "Mohan", "Saras");//o/p:-Ram-Mohan-Saras
//        System.out.println(s.stream().reduce((a, b) -> (a + "-" + b)).get());
        //Optional<String>
    }
}
