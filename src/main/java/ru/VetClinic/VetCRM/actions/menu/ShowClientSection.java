package ru.VetClinic.VetCRM.actions.menu;

import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetAction;
import ru.VetClinic.VetCRM.VetClinic;

/**
 * Created by lstday
 * 06.11.15.
 */
public class ShowClientSection implements VetAction{
    @Override
    public int key() {
        return 1;
    }

    @Override
    public void execute(ReadUserInput userInput, VetClinic vetClinic) {

    }

    @Override
    public String info() {
        return String.format("Press %d to show Client sections", key());
    }
}
