package main;


import java.util.Scanner;

public class practice1 {
    public void ques1() {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.printf("Welcome, %s!", name);
    }

    public void ques2() {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        System.out.printf("%s University %s ", s1, s2);

    }

}
