package main;
//Write a program in Java to accept a String value from the user and print a welcome message in the format given below.

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.printf("Welcome, %s!", name);

    }
}
