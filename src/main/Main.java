/*
 *@ author Tushar Saxena
 * version 1.0
 * */
package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a no");
//        int n = input.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%dx%d = %d\n", n, i, n * i);
//        }
//    }
        //Even Odd
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd no.");
        }
    }
}
