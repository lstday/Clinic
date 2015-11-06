package ru.VetClinic.VetCRM.actions.pet;

import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetAction;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.models.Client;

import java.util.Iterator;

/**
 * Created by lstday
 * 05.11.15.
 */
public class RemovePet implements VetAction { //TODO make inner UID
    @Override
    public int key() {
        return 3;
    }

    @Override
    public void execute(ReadUserInput userInput, VetClinic vetClinic) {
        System.out.println("Please, enter UID of pet:");
        String petUID = userInput.getString();
        vetClinic.removePet(petUID);
    }

    @Override
    public String info() {
        return "Press 3 to remove pet";
    }
}
