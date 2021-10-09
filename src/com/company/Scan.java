package com.company;

import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {
        System.out.print("Input smth: ");
        Scanner scanner = new Scanner(System.in);
        String writtenText = scanner.nextLine();
        System.out.println("You input -> " + writtenText);


        for (int i = 0; i < 3; i++) {
            Scanner scanner1 = new Scanner(System.in);
            String writtenText1 = scanner1.nextLine();
            System.out.print("You input: " + writtenText1 + "\n");
        }

    }
}
