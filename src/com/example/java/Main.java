package com.example.java;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Display the user with options, validate choice and display choice

        int userChoice;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Welcome! Please make a selection from the following: ");
            System.out.println("1. Regular Burger.");
            System.out.println("2. Regular Cheeseburger.");
            System.out.println("3. Bacon Cheeseburger.");
            System.out.println("4. 'Signature' Bacon Cheeseburger.");
            System.out.println("5. Jr Cheeseburger.");

            userChoice = in.nextInt();

            if(userChoice < 1 || userChoice > 5) {
                System.out.println("");
                System.out.println("INVALID SELECTION!");
                System.out.println("");
            }
        }while (userChoice < 1 || userChoice > 5);

        System.out.println("Thanks!");
        System.out.println("");

        System.out.println("You chose: ");

        switch(userChoice){
            case 1:
                System.out.println("Regular Burger.");
                break;
            case 2:
                System.out.println("Regular Cheeseburger.");
                break;
            case 3:
                System.out.println("Bacon Cheeseburger.");
                break;
            case 4:
                System.out.println("'Signature' Bacon Cheeseburger.");
                break;
            case 5:
                System.out.println("Jr Cheeseburger.");
                break;

        }

    }
}
