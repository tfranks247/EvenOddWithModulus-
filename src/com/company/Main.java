package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your number here: ");

        int num1 = key.nextInt();

        for (int i = 1; i <= num1; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else if (i % 2 == 1) {
                System.out.println(i + " is odd");
            }
        }
    }
}

