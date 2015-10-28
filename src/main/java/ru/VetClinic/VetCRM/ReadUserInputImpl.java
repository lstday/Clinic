package ru.VetClinic.VetCRM; /**
 * Created by lstday
 * 23.10.15.
 */

import java.util.Scanner;

/**
 * This class implemented and operates with user input
 */
public class ReadUserInputImpl implements ReadUserInput, AutoCloseable {
    Scanner scanner = new Scanner(System.in);

    @Override
    public char getAnswer() {
        Character answer = null;
        String tempStringAnswer = "";
        do {
            tempStringAnswer = scanner.next();
            if ((!tempStringAnswer.equalsIgnoreCase("y") && !tempStringAnswer.equalsIgnoreCase("n") && !tempStringAnswer.equalsIgnoreCase("q")))
                System.out.println("You must enter y or n or q! Do it!");
        }
        while (!tempStringAnswer.equalsIgnoreCase("y") && !tempStringAnswer.equalsIgnoreCase("n") && !tempStringAnswer.equalsIgnoreCase("q"));
        if (tempStringAnswer.equalsIgnoreCase("y")) return 'y';
        else if (tempStringAnswer.equalsIgnoreCase("n")) return 'n';
        else return 'q';
    }

    @Override
    public String getString() {
        String userInput;
        do {
            userInput = scanner.next();
            if (userInput.length() < 3) {
                System.out.println("You must enter at least 3 symbols!");
                userInput = null; //TODO придумать метод, который обнуляет объекты.
            }
        }
        while (userInput == null);

        return userInput;
    }

    @Override
    public int getNumber(int firstArgOfRange, int secondArgOfRange) {
        int number = Integer.MIN_VALUE;
        do {
            char tempChar = scanner.nextLine().charAt(0);
            if ((tempChar - '0' < firstArgOfRange) || (tempChar - '0' > secondArgOfRange))
                System.out.println("You must enter correct value");
            else
                number = tempChar - '0';
        } while (number < firstArgOfRange || number > secondArgOfRange);
        return number;
    }

    @Override
    public void close() throws Exception {
        scanner.close();
    }
}
