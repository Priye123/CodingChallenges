package javabasics.functionalinterface;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        //Cab c=//lambda expression
//        Predicate<Integer> pr = x -> {
//            if (x > 5)
//                return true;
//            else
//                return false;
//        };
//        Predicate<Integer> pr1 = x -> x > 5;
//
//        boolean c = pr.test(1);
//        System.out.println(c);

        //a & s -> return true,otherwise false

        //publicis sapient
        //String s[]={rahul,priye,sameer,subhakant,ram};
        //length>3 & r contains
        //o/p:-rahul,priye,sameer
        String names[] = {"rahul", "sameer", "subhakant", "ram"};

        Predicate<String> pr = s -> s.length() > 3 && s.contains("r");

        for (String name : names) {
            if (pr.test(name)) {
                System.out.println(name);
            }
        }

    }
}
