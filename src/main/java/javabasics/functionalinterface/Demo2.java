package javabasics.functionalinterface;


//Cab:- Functional Interface
//tripCalc(string,int,string,int)
//Ola class implements Cab
//String source,int sourceDistance,String dest,int destDistance
//cost will be int find:15*(destDistance-sourceDistance)
//print sourcecity & destinationcity return cost
//then we will need to simplify using lambda expressions

@FunctionalInterface
interface Rahul {
    public boolean test(String s);
}

//class Priye implements Rahul {
//
//    @Override
//    public boolean test(String s) {
//        //return s.length()>4?true:false;
//        if (s.length() > 4)
//            return true;
//        else
//            return false;
//    }
//}

public class Demo2 {
    public static void main(String[] args) {
//        Rahul r = new Priye();
//        System.out.println(r.test("Raman"));
//        Rahul r = s -> {
//            if (s.length() > 4)
//                return true;
//            else
//                return false;
//        };
        //Rahul r = s -> s.length() > 4;
        Rahul r = s -> {
            return s.length() > 4;
        };
        boolean isLength = r.test("Rahul");
        System.out.println(isLength);
    }
}
