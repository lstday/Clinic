package ru.VetClinic.VetCRM.actions.inClient;

import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetAction;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.models.Client;
import ru.VetClinic.VetCRM.models.Pet;

/**
 * Created by lstday
 * 03.11.15.
 */
public class RemoveClientPet implements VetAction {
    @Override
    public int key() {
        return 5;
    }

    @Override
    public void execute(ReadUserInput userInput, VetClinic vetClinic) {
        System.out.println("Enter Client name to show his pets");
        String clientName = userInput.getString();
        for (Pet pet : vetClinic.findByName(clientName).getPetList()) {
            System.out.println(pet.getId() + " " + pet.getPetType() + " " + pet.getPetName());
        }

        Client client = vetClinic.findByName(clientName);

        System.out.println("Enter Pet name remove");
        String petName = userInput.getString();
        for (Pet pet : vetClinic.getClientPets(client)) {
            if (pet.getPetName().equals(petName))
                vetClinic.removePet(pet.getId());
        }

    }

    @Override
    public String info() {
        return "Press 5 to remove Clients pet";
    }
}
