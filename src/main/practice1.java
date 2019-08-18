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
//    12 + 3 = 15
//            12 - 3 = 9
//            12 * 3 = 36
//            12 / 3 = 4
//            12 % 3 = 0

    public void ques3() {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
        System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
    }

}
