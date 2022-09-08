package ua.ithillel.lms;

import org.jetbrains.annotations.NotNull;

public class HomeWorkApp {

    public static void main(String[] args) {

        System.out.println("=".repeat(30));
        System.out.println("2.");
        printThreeWords();
        System.out.println("=".repeat(30));
        System.out.println("3.");
        checkSumSign();
        System.out.println("=".repeat(30));
        System.out.println("4.");
        printColor();
        System.out.println("=".repeat(30));
        System.out.println("5.");
        compareNumbers();
        System.out.println("=".repeat(30));
        System.out.println("6.");
        task6(10, 15);
        System.out.println("=".repeat(30));
        System.out.println("7.");
        task7(-50);
        System.out.println("=".repeat(30));
        System.out.println("8.");
        task8(42);
        System.out.println("=".repeat(30));
        System.out.println("9.");
        task9("Dima ,", 5);
        System.out.println("=".repeat(30));
        System.out.println("10.");
        task10(2020);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 25;
        int b = 30;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("The amount is positive");
        } else {
            System.out.println("The sum is negative");
        }
    }

    public static void printColor() {
        int value = 110;

        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 & value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 50;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean task6(int s, int f) {
        int sum = s + f;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static void task7(int d) {
        if (d >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("A negative number");
        }
    }

    public static boolean task8(int c) {
        if (c >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void task9(@NotNull String str, int n) {
        System.out.println(str.repeat(n));
    }

    public static boolean task10(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
            return true;
        } else {
            System.out.println(year + " is not a leap year.");
            return false;
        }
    }
}



