// Chapter 4 - Logical Operators

package week4Notes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = Integer.parseInt(keyboard.nextLine());

        System.out.println("Are you Male or Female (M/F): ");
        String gender = keyboard.nextLine();

        // && is the "And" shortcut
        // || is the "Or" shortcut
        // ! is teh "Not" shortcut, so !True == False

        if (age < 25 && gender.equalsIgnoreCase("M")) {
            System.out.println("Your insurance rate is $250/month");
        } else if (age < 25) {
            System.out.println("Your insurance rate is $200/month");
        } else {
            System.out.println("Your insurance rate is $150/month");
        }

        System.out.println("Please enter your annual income: ");
        int annualIncome = Integer.parseInt(keyboard.nextLine());

        System.out.println("Do you have any previous bankruptcies? (y/n)");
        String previousBankruptcies = keyboard.nextLine();

        if (annualIncome > 1_000_000 ||
                (annualIncome > 50_000 &&
                        previousBankruptcies.equalsIgnoreCase("n"))) {
            System.out.println("Here's your loan");
        } else {
            System.out.println("No loan for you.");
        }
        System.out.println("Do you want to play again? (y/n)");
        String playAgain = keyboard.nextLine();

        // while play again is NOT equal to N
        while (!playAgain.equalsIgnoreCase("n")) {
            System.out.println("Do you want to play again? (y/n)");
            playAgain = keyboard.nextLine();
        }


// Chapter 4 - Switches

        System.out.println("Enter your favorite color");
        String favoriteColor = keyboard.nextLine();

        if (favoriteColor.equalsIgnoreCase("blue")) {
            System.out.println("That's my favorite too!");
        } else if (favoriteColor.equalsIgnoreCase("red")) {
            System.out.println("Red is fun");
        } else if (favoriteColor.equalsIgnoreCase("purple")) {
            System.out.println("Purple is fun");
        } else {
            System.out.println("Cool");
        }

        switch (favoriteColor) {
            case "blue":
                System.out.println("That's my favorite too!");
                break; // ends the switch
            case "red":
                System.out.println("Red is fun");
                break;
            case "purple":
                System.out.println("Purple is fun");
                break;
            default:
                System.out.println("Cool");
        }

        System.out.println("Enter your favorite number");
        int favoriteNumber = Integer.parseInt(keyboard.nextLine());

        if (favoriteNumber > 0 && favoriteNumber < 10) {
            System.out.println("You like single digits.");
        } else if (favoriteNumber >= 10 && favoriteNumber < 10) {
            System.out.println("You like double digits.");
        } else {
            System.out.println("You like big numbers.");
        }

        switch (favoriteNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("You like single digits.");
        }


        int number = 0;

        while (number < 10) {
            System.out.println(number);
            number++;
        }


// Chapter 4 - Loops


        int anotherNumber = 0;
        do {
            System.out.println(anotherNumber);
            anotherNumber++;
        } while (anotherNumber < 10);

        // this is an infinite loop
        //int thirdNumber = 0;
        //while ( anotherNumber < 10);{
        //System.out.println("something here");
        //thirdNumber++;
        //}


        // Validation Loop - only ends when we have a valid input
        String pillColor = "";

        while (!pillColor.equalsIgnoreCase("blue") &&
                !pillColor.equalsIgnoreCase("red")) {
            System.out.println("Do you want the blue pill or the red pill?");
            pillColor = keyboard.nextLine();
        }

        // For Loop - first value is the Declaration, second value is the Test, third value is the Result

        for (int value = 0; value < 10; value++) {
            System.out.println(value);
        }

        System.out.println("Enter the width of a rectangle.");
        int width = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter the height of a rectangle.");
        int height = Integer.parseInt(keyboard.nextLine());

        for (int currentRow = 0; currentRow < height; currentRow++) {
            for (int currentColumn = 0; currentColumn < width; currentColumn++) {
                //System.out.print - doesn't add a newline after printing
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



