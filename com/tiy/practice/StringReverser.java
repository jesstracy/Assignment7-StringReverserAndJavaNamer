package com.tiy.practice;

import java.util.Scanner;

public class StringReverser {
	public static void main(String[] args) {
	    Scanner myScanner = new Scanner(System.in);

        StringReverser myStringReverser = new StringReverser();

// String Reverser Code
        System.out.println("******************* Part 1 of assignment ******************");
        System.out.print("Please enter a String to be reversed: ");
        String userString = myScanner.nextLine();

        char[] stringCharacters = userString.toCharArray();

        // Test: print stringCharacters array
//        for (int counter = 0; counter < stringCharacters.length; counter++) {
//            System.out.println(stringCharacters[counter]);
//        }

        String answer = myStringReverser.reverseString(stringCharacters);
        System.out.println("Your reversed string is: " + answer);


// JavaNamerCode
        System.out.println();
        System.out.println("******************* Part 2 of assignment ******************");
        System.out.print("Please enter a String, and separate words with a space: ");
        String inputString = myScanner.nextLine();
        System.out.println("You entered: " + inputString);
        JavaNamer myNamer = new JavaNamer();

        //Ask the user what to do.
        myStringReverser.runMenuOfOptions(inputString, myNamer);
    }



    public String reverseString(char[] stringCharacters) {
        //Make a new array that's the same length as stringCharacters
        char[] stringCharactersReversed = new char[stringCharacters.length];

        System.out.println("Reversing your String...");

        //make the first element of stringCharacters the last element of stringCharactersReversed
        for (int arrayIndex = 0; arrayIndex < stringCharacters.length; arrayIndex++) {
            stringCharactersReversed[stringCharacters.length - (arrayIndex + 1)] = stringCharacters[arrayIndex];
        }

        String answer = "";

        for (int counter = 0; counter < stringCharactersReversed.length; counter++) {
            answer += stringCharactersReversed[counter];
        }
        return answer;
    }

    public void runMenuOfOptions(String inputString, JavaNamer myNamer) {
        Scanner myScanner = new Scanner(System.in);
        int userChoice;
        while (true) {
            System.out.println();
            System.out.println("What would you like to do? ");
            System.out.println(" (1) Make my string into a variable name");
            System.out.println(" (2) Make my string into a method name");
            System.out.println(" (3) Make my string into a class name");
            System.out.println(" (4) Exit");
            userChoice = myScanner.nextInt();
            myScanner.nextLine();

            if (userChoice == 1) { // variable
                String answer2 = myNamer.makeVariableName(inputString);
                System.out.println("Your variable name is: " + answer2);
            } else if (userChoice == 2) { // method
                String answer2 = myNamer.makeMethodName(inputString);
                System.out.println("Your method name is: " + answer2);
            } else if (userChoice == 3) { // class
                String answer2 = myNamer.makeClassName(inputString);
                System.out.println("Your class name is: " + answer2);
            } else if (userChoice == 4) { // exit
                break;
            }
        }
    }
}