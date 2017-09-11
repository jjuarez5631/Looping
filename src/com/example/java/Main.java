package com.example.java;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Display the user with options, validate choice and display choice

        int userChoice; //variable for the users input
        Scanner in = new Scanner(System.in);
                        //while loop to validate users input and display information
        do {
            System.out.println("Welcome! Please make a selection from the following: ");
            System.out.println("1. Regular Burger.");
            System.out.println("2. Regular Cheeseburger.");
            System.out.println("3. Bacon Cheeseburger.");
            System.out.println("4. 'Signature' Bacon Cheeseburger.");
            System.out.println("5. Jr Cheeseburger.");

            userChoice = in.nextInt();

            System.out.println("You chose: ");
                        //display the users choice
            switch(userChoice){
                case 1:
                    System.out.println("A Regular Burger.");
                    break;
                case 2:
                    System.out.println("A Regular Cheeseburger.");
                    break;
                case 3:
                    System.out.println("A Bacon Cheeseburger.");
                    break;
                case 4:
                    System.out.println("The 'Signature' Bacon Cheeseburger.");
                    break;
                case 5:
                    System.out.println("A Jr Cheeseburger.");
                    break;
                default:
                    System.out.println("An Invalid Selection.");
                    System.out.println("");

            }
        }while (userChoice < 1 || userChoice > 5);

        System.out.println("");
        System.out.println("Thanks!");



    }
}
