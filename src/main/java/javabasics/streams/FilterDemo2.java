package javabasics.streams;

import java.util.Arrays;

class Product {
    int id;
    String name;
    int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class FilterDemo2 {

    public static void main(String[] args) {
        Product product[] = new Product[5];
        product[0] = new Product(1, "HP", 20000);
        product[1] = new Product(2, "DELL", 26000);
        product[2] = new Product(3, "LENOVO", 34000);
        product[3] = new Product(4, "ACER", 15000);
        product[4] = new Product(5, "SAMSUNG", 45000);

        Arrays.stream(product).filter(p -> p.price > 25000).forEach(p -> System.out.println(p.name));
    }
}
