package com.methods.methodexample.TryCatch;

import java.util.Scanner;

public class NumberFormat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number Input");
        String userInput = input.nextLine();

        try {
            int number = Integer.parseInt(userInput);
            System.out.println("You are Typing: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Wrong input");
        } finally {
            System.out.println("Finaaaaaallyyyyyyyyyyy");
        }
    }

}
