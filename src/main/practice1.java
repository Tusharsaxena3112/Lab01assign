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

    public void ques4() {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        if (num1 > 0) {
            System.out.println("Positive");
        } else if (num1 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public void ques5() {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int counter = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

}
