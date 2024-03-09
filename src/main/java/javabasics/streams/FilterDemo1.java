package javabasics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {
        //1st list(main):- 10,15,20,25,30
        //2nd list:- even numbers
        //3rd list:- odd numbers
        List<Integer> numbersList = Arrays.asList(10, 15, 20, 25, 30);
        List<Integer> evenNumbersList = numbersList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbersList);

//        numbersList.stream().filter(n -> n % 2 == 0) //10,20,30
//                .forEach(n -> System.out.println(n));

        numbersList.stream().filter(n -> n % 2 == 0) //10,20,30
                .forEach(n -> System.out.println(n));//spread operator

        //string list of 6 objects null,"PriyeRanjan","RahulDas",null
        //print non-null values
        //length:- 6-8
        //print that string

        //Product class
        //id,name,price
        //create 5 product objects
        //product price > 25000 ,print that product name


    }
}
