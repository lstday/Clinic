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
public class ShowPetsOfClient implements VetAction {
    @Override
    public int key() {
        return 4;
    }

    @Override
    public void execute(ReadUserInput userInput, VetClinic vetClinic) {
        if (!vetClinic.getClientList().isEmpty()) {
            System.out.println("Enter Client name to show his pets");
//        String clientName = userInput.getString();
            String clientName;
            Client client;
            while (!vetClinic.getClientList().contains(vetClinic.findClientByName(clientName = userInput.getString()))) {
                System.out.println("Enter RIGHT name of user to add him pet");
            }
            client = vetClinic.findClientByName(clientName);
            for (Pet pet : client.getPetList()) {
                System.out.println(pet.getId() + " " + pet.getPetType() + " " + pet.getPetName());
            }
        } else {
            System.out.println("We have't clients!");
        }
    }

    @Override
    public String info() {
        return String.format("Press %d to show pets", key());
    }
}
