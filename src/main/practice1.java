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

    public void ques6() {
        //working.....
    }

    public void ques7() {
        Scanner input = new Scanner(System.in);
        char c1 = input.next().charAt(0);
        if ((int) c1 >= 65 && (int) c1 <= 91 || (int) c1 >= 97 && (int) c1 <= 122) {
            System.out.println("Alphabet");
        } else if ((int) c1 >= 48 && (int) c1 <= 57) {
            System.out.println("Digit");
        } else {
            System.out.println("special character");
        }
    }

    public void ques8() {
        Scanner input = new Scanner(System.in);
        String gen = input.nextLine();
        int age = input.nextInt();
        if (gen.equals("female") && (age >= 1 && age <= 58)) {
            System.out.println("8.2%");
        } else if (gen.equals("female") && (age >= 59 && age <= 100)) {
            System.out.println("9.2%");
        } else if (gen.equals("male") && (age >= 1 && age <= 58)) {
            System.out.println("8.4%");
        } else if (gen.equals("male") && (age >= 59 && age <= 100)) {
            System.out.println("10.5%");
        } else {
            System.out.println("Invalid input !Error");
            System.out.printf("%d %s", (age), gen);
        }
    }

    public void ques9() {
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        if ((int) c >= 65 && (int) c <= 90) {
            System.out.printf("%c", (int) c + 32);
        } else if ((int) c >= 97 && (int) c <= 122) {
            System.out.printf("%c", (int) c - 32);
        }
    }

    public void ques10() {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("aug");
                break;
            case 9:
                System.out.println("sept");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("Invalid");
        }
    }

    public void ques11() {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int m;
        if (start % 2 != 0) {
            m = start + 1;
        } else {
            m = start;
        }
        for (int i = m; i <= end; i = i + 2) {
            System.out.println(i);
        }
    }

    public void ques12() {
        Scanner input = new Scanner(System.in);
        int rem = 0, sum = 0;
        int num = input.nextInt();
        for (int i = num; i > 0; i = i / 10) {
            rem = i % 10;
            sum += rem;
        }
        System.out.println(sum);
    }
}
