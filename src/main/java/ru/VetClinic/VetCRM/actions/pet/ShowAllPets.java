package ru.VetClinic.VetCRM.actions.pet;

import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetAction;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.models.Client;
import ru.VetClinic.VetCRM.models.Pet;

/**
 * Created by lstday
 * 05.11.15.
 */
public class ShowAllPets implements VetAction {
    @Override
    public int key() {
        return 1;
    }

    @Override
    public void execute(ReadUserInput userInput, VetClinic vetClinic) {
        System.out.println("There are all pets:");
        for (Client client : vetClinic.getClientList()) {
            System.out.println("Pet owner:" + client.getName());
            for (Pet pet : client.getPetList()) {
                System.out.println(pet.getId() + " " + pet.getPetName());
            }
        }
    }

    @Override
    public String info() {
        return String.format("Press %d to show all pets", key());
    }
}
