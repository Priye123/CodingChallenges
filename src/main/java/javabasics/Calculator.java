package javabasics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter Two numbers::");
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("+ Add");
            System.out.println("- Sub");
            System.out.println("* Mul");
            System.out.println("/ Div");
            System.out.println("% Rem");

            System.out.print("Enter your choice::");
            char ch = sc.next().charAt(0);

            switch (ch) {
                case '+':
                    System.out.println("Addition::" + (a + b));
                    break;

                case '-':
                    System.out.println("Subtraction::" + (a - b));
                    break;

                case '*':
                    System.out.println("Multiplication::" + (a * b));
                    break;

                case '/':
                    System.out.println("Division::" + (a / b));
                    break;

                case '%':
                    System.out.println("Remainder::" + (a % b));
                    break;

                default:
                    System.out.println("Invalid choice");
                    System.exit(0);//program terminate

            }
        }


    }

}
