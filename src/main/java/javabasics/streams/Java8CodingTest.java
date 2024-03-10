package javabasics.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Java8CodingTest {
    ////print sum of odd numbers from 1 to n,n=11(exclusive)
    public static void main(String[] args) {
        //s1();
        // s2();
        // s3();
        //s4();
        //s5();
        //s6();
        s7();
    }


    private static void s7() {
        List<Integer> l = Arrays.asList(234, -4, 1, -2, 23, -4, 25);//-4 -2 1 23 25 234

        //find 2nd lowest number
        int secL = l.stream().distinct().sorted().limit(2).skip(1).findFirst().get();
        System.out.println(secL);

        //find 2nd highest number
        int secH = l.stream().distinct().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
        System.out.println(secH);

    }
    //o/p:- -4 -2 1
    //l.stream().distinct().sorted().limit(3).forEach(n-> System.out.print(n+" "));

    private static void s6() {
        List<Integer> l = Arrays.asList(234, -4, 1, 2, 23, -4, 25);//starts with 2
        //l.stream().map(x -> x.toString()).filter(x -> x.startsWith("2")).forEach(System.out::println);
        System.out.println(l.stream().map(x -> x.toString()).filter(x -> x.startsWith("2")).map(x -> Integer.parseInt(x)).reduce(Integer::sum).get());
        //234+2+23+25=
    }

    private static void s5() {
        List<Integer> l = Arrays.asList(1, 2, 1, 3, 2, 1, 2);
        //l.stream().distinct().forEach(System.out::println);
//        Set<Integer> set = new HashSet<>();
//        for (int x : l) {
//            if (!set.add(x)) {
//                System.out.println(x);
//            }else{
//
//            }
//        }
//        System.out.println("-----------------");
//        System.out.println(set);

        //System.out.println(set);


//        Set<Integer> dup=l.stream().filter(e-> !set.add(e)).collect(Collectors.toSet());
//        System.out.println(dup);
    }

    private static void s4() {
        List<String> s = Arrays.asList("Raman", "Sam", "Bolo");
        //List<Integer> l = s.stream().map(e -> e.length()).collect(Collectors.toList());
        //System.out.println(l);
        s.stream().map(e -> e.length()).forEach(n -> System.out.print(n + " "));
    }

    private static void s3() {
        List<Integer> l = Arrays.asList(1, 10, 20, 30, 15);
        //1 100 400 900 225
        //>100(400 900 225)
        //1525/3=508.3333
        double avg = l.stream()
                .map(e -> e * e)
                .filter(e -> e > 100)
                .mapToInt(e -> e)
                .average()
                .getAsDouble();
        System.out.println(avg);

    }

    private static void s2() {
        List<Integer> l = Arrays.asList(1, 10, 20, 30, 15);
        System.out.println(l.stream().mapToInt(e -> e).average().getAsDouble());
    }

    private static void s1() {
        //double for all numbers from 1 to n
        //1 to 5 :- 1+2+3+4+5/5=3.0
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i < n; i++)
            l.add(i);
        //System.out.println(l.stream().reduce((a, b) -> a + b).get());
        System.out.println(l.stream().reduce(Integer::sum).get());
//        System.out.println(l.stream().
//                filter(n1 -> (n1 % 2 != 0)).
//                reduce((a, b) -> a + b).get());
    }
}
