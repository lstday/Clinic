package ru.VetClinic.VetCRM.actions.inClient;

import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetAction;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.models.Client;
import ru.VetClinic.VetCRM.models.Pet;
import ru.VetClinic.VetCRM.models.PetType;

/**
 * Created by lstday
 * 03.11.15.
 */
public class AddPetToClient implements VetAction {
    @Override
    public int key() {
        return 6;
    }

    @Override
    public void execute(ReadUserInput userInput, VetClinic vetClinic) {
        System.out.println("Enter name of user to add him pet");
        String clientName = userInput.getString();
        //System.out.println("What type of pet?");
        //
        String clientId = vetClinic.findByName(clientName).getId();
        System.out.println("Enter name of pet");
        String petName = userInput.getString();
        Pet pet = new Pet(PetType.UNKNOWNMONSTER, petName); //как сделать выбор?
        vetClinic.addPet(clientId, pet);
    }

    @Override
    public String info() {
        return "Press 6 to add new pet to Client";
    }
}
