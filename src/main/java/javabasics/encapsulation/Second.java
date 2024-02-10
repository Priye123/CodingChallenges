package javabasics.encapsulation;

//make variable private and method public is called encapsulation.
class Encapsulation {
    private String name;
    private int roll;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }
}

class Second {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setName("Rahul");
//        //e.name = "Rahul";
//        e.setRoll(20);
        // e.roll = 20;
        System.out.println(e.getName());
        System.out.println(e.getRoll());
    }
}



