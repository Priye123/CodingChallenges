package javabasics.streams;

import java.util.*;
import java.util.stream.Collectors;

public class NonTerminalMethods {
    public static void main(String[] args) {
        //how to remove duplicates in array
        int a[] = {1, 2, 1, 1, 2, 3, 1, 2};//o/p:-{1,2,3};
//        Set<Integer> set = new LinkedHashSet<>();
//        for (int x : a)
//            set.add(x);
//        System.out.println(set);
        //Arrays.stream(a).distinct().forEach(System.out::println);
        //count elements in array:- brute force approach
//        long c = Arrays.stream(a).count();
//        int x = (int) c;
//        System.out.println(x);
        //count of even numbers:3
        //System.out.println(Arrays.stream(a).filter(n -> (n % 2) == 0).count());
        //char c[] = {'a', 'b', 'c', 'd', 'e'};
//        List<Character> c = Arrays.asList('a', 'b', 'c', 'd', 'e');
//        //limit()
//        List<Character> d = c.stream().limit(3).collect(Collectors.toList());
//        System.out.println(d);
        // System.out.println(Arrays.stream(b).max().getAsInt());
        //System.out.println(Arrays.stream(b).min().getAsInt());
        //reduce()

        int b[] = {1, 2, 11, 6, -9, 8};
        List<Integer> l = new ArrayList<>();

    }
}
