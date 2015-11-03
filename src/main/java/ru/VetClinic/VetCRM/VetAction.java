package ru.VetClinic.VetCRM;

/**
 * Created by lstday
 * 03.11.15.
 */
public interface VetAction {
    /**
     * key of operation
     *
     * @return
     */
    int key();

    /**
     * Realize some actions
     *
     * @param userInput
     * @param vetClinic
     */
    void execute(ReadUserInput userInput, VetClinic vetClinic);

    /**
     * Action information
     *
     * @return
     */
    String info();
}
