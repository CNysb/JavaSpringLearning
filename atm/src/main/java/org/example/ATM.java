package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);


    public void start() {
        System.out.println("Welcome to ATM");
        System.out.println("1. login");
        System.out.println("2. create account ");
        System.out.println("insert your action number: ");
        String actNumber = sc.next();
        switch (actNumber) {
            case "1":
                break;
            case "2":
                break;
            default:
                System.out.println("Invalid action number");

        }

    }
}
