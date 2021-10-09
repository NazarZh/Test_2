package com.company;

public class Swit {
    public static void main(String[] args) {
        String cardType = "Visa";
        switch (cardType) {
            case "Visa":
                System.out.println("You have a VISA card");
                break;
            case "Master":
                System.out.println("You have a MASTER card");
                break;
            default:
                System.out.println("You have cash");
        }
    }
}
