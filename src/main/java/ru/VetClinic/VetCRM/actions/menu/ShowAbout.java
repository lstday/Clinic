package ru.VetClinic.VetCRM.actions.menu;

import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetAction;
import ru.VetClinic.VetCRM.VetCRM;
import ru.VetClinic.VetCRM.VetClinic;

/**
 * Created by lstday
 * 06.11.15.
 */
public class ShowAbout implements VetAction {
    @Override
    public int key() {
        return 3;
    }

    @Override
    public void execute(ReadUserInput userInput, VetClinic vetClinic) {
        System.out.printf("This is VetCRM(tm) v%s. All Rights Reserved. Ask your questions on sakhar.medovich@gmail.com\n",
                VetCRM.version); }

    @Override
    public String info() {
        return String.format("Press %d to show about", key());
    }
}