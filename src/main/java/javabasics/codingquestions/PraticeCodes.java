package javabasics.codingquestions;

public class PraticeCodes {
    public static void main(String[] args) {
        p1();
    }

    private static void p1() {
        int a = 1234,on=a,revNum=0;//4*1000+3*100+2*10+1*1
//        String s = Integer.toString(a);
//        String st = new StringBuilder(s).reverse().toString();
//        System.out.println(Integer.parseInt(st));
        int nod = 0;
        while (a != 0) {
            a /= 10;
            nod++;
        }
        a=on;
        while(a!=0){
           revNum=revNum+a%10*(int)Math.pow(10,nod-1);
           nod--;
           a/=10;
        }
        System.out.println(revNum);
    }
}
