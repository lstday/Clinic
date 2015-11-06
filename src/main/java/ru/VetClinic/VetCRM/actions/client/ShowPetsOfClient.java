package ru.VetClinic.VetCRM.actions.client;

import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetAction;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.models.Pet;

/**
 * Created by lstday
 * 03.11.15.
 */
public class ShowPetsOfClient implements VetAction {
    @Override
    public int key() {
        return 4;
    }

    @Override
    public void execute(ReadUserInput userInput, VetClinic vetClinic) {
        System.out.println("Enter Client name to show his pets");
        String clientName = userInput.getString();
        for (Pet pet : vetClinic.findClientByName(clientName).getPetList()) {
            System.out.println(pet.getId() + " " + pet.getPetType() + " " + pet.getPetName());
        }
    }

    @Override
    public String info() {
        return "Press 4 to show pets";
    }
}
