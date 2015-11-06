package ru.VetClinic.VetCRM.actions.menu;

import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetAction;
import ru.VetClinic.VetCRM.VetClinic;

/**
 * Created by lstday
 * 06.11.15.
 */
public class ShowPetSection implements VetAction {
    @Override
    public int key() {
        return 2;
    }

    @Override
    public void execute(ReadUserInput userInput, VetClinic vetClinic) {

    }

    @Override
    public String info() {
        return String.format("Press %d to show Pet sections", key());
    }
}