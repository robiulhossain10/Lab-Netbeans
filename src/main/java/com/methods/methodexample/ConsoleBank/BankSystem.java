/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.ConsoleBank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author A-3
 */
public class BankSystem {

    private static Map<Integer, Accounts> accountsMap = new HashMap<>();

    private static final String FILE_NAME = "accounts.dat";

    public static void main(String[] args) {
        loadAccounts();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== 🏦 Mini Bank Menu ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Account");
            System.out.println("5. Save & Exit");
            System.out.print("👉 Choose: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 ->
                    createAccount(sc);
                case 2 ->
                    depositMoney(sc);
                case 3 ->
                    withdrawMoney(sc);
                case 4 ->
                    showAccount(sc);
                case 5 ->
                    saveAccounts();
                default ->
                    System.out.println("⚠️ Invalid choice!");
            }
        } while (choice != 5);
    }

    private static void createAccount(Scanner sc) {
        System.out.print("Enter account ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        if (accountsMap.containsKey(id)) {
            System.out.println("❌ Account ID already exists.");
        } else {
            accountsMap.put(id, new Accounts(id, name, balance));
            System.out.println("✅ Account created successfully.");
        }
    }

    private static void depositMoney(Scanner sc) {
        System.out.print("Enter account ID: ");
        int id = sc.nextInt();//4
        System.out.print("Enter amount to deposit: ");
        double amt = sc.nextDouble();

        Accounts acc = accountsMap.get(id);
        if (acc != null) {
            acc.deposit(amt);
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    private static void withdrawMoney(Scanner sc) {
        System.out.print("Enter account ID: ");
        int id = sc.nextInt();
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();

        Accounts acc = accountsMap.get(id);
        if (acc != null) {
            acc.withdraw(amt);
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    private static void showAccount(Scanner sc) {
        System.out.print("Enter account ID: ");
        int id = sc.nextInt();

        Accounts acc = accountsMap.get(id);
        if (acc != null) {
            acc.display();
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    private static void saveAccounts() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            out.writeObject(accountsMap);
            System.out.println("💾 Accounts saved. Goodbye!");
        } catch (IOException e) {
            System.out.println("❌ Error saving accounts: " + e.getMessage());
        }
    }

    private static void loadAccounts() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME));
            accountsMap = (Map<Integer, Accounts>) in.readObject();
            System.out.println("📂 Loaded accounts from file.");
        } catch (FileNotFoundException e) {
            System.out.println("📁 No previous data found. Starting fresh.");
        } catch (Exception e) {
            System.out.println("❌ Error loading accounts: " + e.getMessage());
        }
    }
}


