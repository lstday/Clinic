package ru.VetClinic.VetCRM;

import java.util.Scanner;

/**
 * Created by lstday
 * 23.10.15.
 */
public interface ReadUserInput {
    char getAnswer();

    String getString();

    int getNumber(int firstArgOfRange, int secondArgOfRange);

}
