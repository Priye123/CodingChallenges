package javabasics;

import java.util.Scanner;
import java.util.Stack;

public class BackSpaceStringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        BackSpaceStringCompare b = new BackSpaceStringCompare();
        boolean c = b.backspaceCompare(s, t);
        System.out.println(c);
    }

    public boolean backspaceCompare(String s, String t) {
        String x = operate(s);
        String y = operate(t);
        if (x.equals(y))
            return true;
        else
            return false;
    }

    private String operate(String s) {
        Stack<Character> st1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '#') {
                st1.push(ch);
            } else {
                st1.pop();
            }
        }
        String x = "";
        while (!st1.isEmpty()) {
            x = st1.pop() + x;
        }
        //System.out.println(x);
        return x;
    }
}
