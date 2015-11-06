package ru.VetClinic.VetCRM;

/**
 * Created by lstday
 * 03.11.15.
 */
public interface VetAction {
    /**
     * key of operation
     *
     * @returns key of operation
     */
    int key();

    /**
     * Realize some actions whith pet or client
     *
     * @param userInput - read from console with validator: string, int or y/n
     * @param vetClinic - instance of vetclinic
     */
    void execute(ReadUserInput userInput, VetClinic vetClinic);

    /**
     * Action information
     *
     * @return string whith info about action
     */
    String info();
}
