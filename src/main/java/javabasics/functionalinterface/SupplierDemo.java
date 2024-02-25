package javabasics.functionalinterface;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        //Supplier<R> -> get()
//        Supplier<String> s = () -> "Raman";
//        System.out.println(s.get());

//        Supplier<Date> d = () -> new Date();
//        System.out.println(d.get());

//        Supplier<String> s = () -> "Rahul";
//        System.out.println(s.get());

        int a[] = {20, 30, 40};//store primitive data

        List<Integer> l = new ArrayList<>();//store objects,l is entity(10,20,30 are objects)
        l.add(10);
        l.add(20);
        l.add(30);

        System.out.println(l);

//        for (int x : l) {
//            if (x > 15) {
//                System.out.println(x);
//            }
//        }


    }
}
