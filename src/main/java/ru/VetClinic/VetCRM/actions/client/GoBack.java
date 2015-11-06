package ru.VetClinic.VetCRM.actions.client;

import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetAction;
import ru.VetClinic.VetCRM.VetClinic;

/**
 * Created by lstday
 * 06.11.15.
 */
public class GoBack implements VetAction {
    @Override
    public int key() {
        return 0;
    }

    @Override
    public void execute(ReadUserInput userInput, VetClinic vetClinic) {
// ??
    }

    @Override
    public String info() {
        return String.format("Press %d to go back", key());
    }
}
