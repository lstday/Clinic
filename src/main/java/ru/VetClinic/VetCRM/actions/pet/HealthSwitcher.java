package ru.VetClinic.VetCRM.actions.pet;

import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetAction;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.models.Client;
import ru.VetClinic.VetCRM.models.Pet;

import java.util.Objects;

/**
 * Created by lstday
 * 06.11.15.
 */
public class HealthSwitcher implements VetAction {
    @Override
    public int key() {
        return 4;
    }

    @Override
    public void execute(ReadUserInput userInput, VetClinic vetClinic) {
        System.out.println("Enter Client name");
        String clientName = userInput.getString();
        System.out.printf("Here pets of client %s:\n", clientName);
        for (Pet pet : vetClinic.findClientByName(clientName).getPetList()) {
            System.out.println("id:"+pet.getId() + " type:" + pet.getPetType() + " name:" + pet.getPetName());
        }
        Client client = vetClinic.findClientByName(clientName);

        System.out.println("Enter Pet name to switch health status");
        String petName = userInput.getString();

        Pet pet = vetClinic.findPetByName(client, petName);
        pet.switchHealth();

//        for (Pet pet : client.getPetList()) {
//            if (Objects.equals(pet.getPetName(), petName)) {
//                pet.switchHealth();
//            }
//        }

    }

    @Override
    public String info() {
        return "Press 4 for switch health state of pet";
    }
}
