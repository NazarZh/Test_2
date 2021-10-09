package com.company;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner scanner1 = new Scanner(System.in);
        String str1 = scanner1.nextLine();
        int num1 = Integer.parseInt(str1);
        System.out.print("Input another number: ");
        Scanner scanner2 = new Scanner(System.in);
        String str2 = scanner2.nextLine();
        int num2 = Integer.parseInt(str2);
        if (num1 > num2) {
            System.out.println("The first number is bigger");
        } else {
            System.out.println("The second number is bigger");
        }
        int a = 10;
        int b = 15;
        System.out.println(a > b ? "a > b" : "a < b");
    }
}
