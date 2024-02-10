package javabasics.inheritance;

class Rectangle {
    int length;
    int breadth;

//    public Rectangle(int length, int breadth) {
//        this.length = length;
//        this.breadth = breadth;
//    }

    void area() {
        System.out.println(length * breadth);
    }
}

class Cube extends Rectangle {
    //    int length;
//    int breadth;
    int height;

//    public Cube(int length, int breadth, int height) {
//        super(length, breadth);
//        this.height = height;
//    }

    void area() {
        System.out.println(length * breadth * height);
    }
}

public class Master {
    public static void main(String[] args) {
//        Rectangle r = new Rectangle(10, 20);
//        r.area();


    }

}
