package javabasics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethods2 {
    public static void main(String[] args) {
        //findAny()
        //findFirst()
        //Top Interview Question
//        try {
//            Optional<String> ele = fruits.stream().findAny();
//            System.out.println(ele.get());
//        }catch (Exception e){
//            System.out.println("no value in array");
//        }
        List<String> fruits = Arrays.asList("two", "three");
        Optional<String> ele = fruits.stream().findFirst();
        if (ele.isPresent()) {
            System.out.println(ele.get());
        } else {
            System.out.println("no value in array");
        }
        // System.out.println(ele.get());

    }
}
