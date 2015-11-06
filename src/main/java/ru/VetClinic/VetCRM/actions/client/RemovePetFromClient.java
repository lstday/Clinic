package ru.VetClinic.VetCRM.actions.client;

import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetAction;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.models.Client;
import ru.VetClinic.VetCRM.models.Pet;

/**
 * Created by lstday
 * 03.11.15.
 */
public class RemovePetFromClient implements VetAction {
    @Override
    public int key() {
        return 5;
    }

    @Override
    public void execute(ReadUserInput userInput, VetClinic vetClinic) {
        System.out.println("Enter Client name to show his pets");
        String clientName = userInput.getString();
        System.out.printf("Here pets of client %s:\n", clientName);
        for (Pet pet : vetClinic.findClientByName(clientName).getPetList()) {
            System.out.println(pet.getId() + " " + pet.getPetType() + " " + pet.getPetName());
        }

        Client client = vetClinic.findClientByName(clientName);

        System.out.println("Enter Pet name to remove");
        String petName = userInput.getString();

        for (Pet pet : vetClinic.getClientPets(client)) { //TODO bad, get iterator.
            if (pet.getPetName().equals(petName))
            {
                vetClinic.removePet(pet.getUid());
                break;
            }
        }
    }

    @Override
    public String info() {
        return String.format("Press %d to remove Clients pet", key());
    }
}
