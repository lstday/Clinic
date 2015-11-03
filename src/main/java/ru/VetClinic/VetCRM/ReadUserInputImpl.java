package ru.VetClinic.VetCRM; /**
 * Created by lstday
 * 23.10.15.
 */

import java.util.Scanner;

/**
 * This class implemented and operates with user input
 */

//переименовать весь класс
public class ReadUserInputImpl implements ReadUserInput, AutoCloseable {
    Scanner scanner = new Scanner(System.in);

    @Override
    public char getAnswer() {
        String tempStringAnswer;
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
            userInput = scanner.nextLine();
            if (userInput.length() < 3) {
                System.out.println("You must enter at least 3 symbols!");
                userInput = null;
            }
        }
        while (userInput == null);
        return userInput;
    }

    @Override
    public int getNumber(int firstArgOfRange, int secondArgOfRange) {
/*        int number = Integer.MIN_VALUE;
        do {
            char tempChar = scanner.nextLine().charAt(0);
            if ((tempChar - '0' < firstArgOfRange) || (tempChar - '0' > secondArgOfRange))
                System.out.println("You must enter correct value");
            else
                number = tempChar - '0';
        } while (number < firstArgOfRange || number > secondArgOfRange);
        return number;
        // it's old version
        */

        int number;
        do {
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number < firstArgOfRange || number > secondArgOfRange);
        scanner.nextLine();
        return number;
    }

    @Override
    public void close() throws Exception {
        scanner.close();
    }

//    public int getNumber() {
//        int number = Integer.MIN_VALUE;
//        do {
//            while (!scanner.hasNextInt()) {
//                scanner.next();
//            }
//            number = scanner.nextInt();
//        } while (number == Integer.MIN_VALUE);
//        scanner.nextLine();
//        return number;
//    }
}
