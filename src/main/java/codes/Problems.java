package codes;

import java.util.Scanner;

public class Problems {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //digits:0-9
        int su = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
//            if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9') {
//                //converting char ch to int by doing ch-'0'
//                su = su + (ch - '0');
//            }
            if (Character.isDigit(ch)) {
                su = su + (ch - '0');
            }
        }
        sum(su);
    }

    public static void sum(int sum) {
        System.out.println(sum);
    }

}
