package ru.VetClinic.VetCRM.actions.client;

import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetAction;
import ru.VetClinic.VetCRM.VetClinic;
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
        int clientId = vetClinic.findClientByName(clientName).getId();
        System.out.println("Enter name of pet");
        String petName = userInput.getString();
        System.out.println("Enter type of pet. (cat, dog, fish or crocodile)");
        String petType;
        while (!PetType.contains(petType = userInput.getString())) {
            System.out.println("Wrong pet type!");
        }

        Pet pet = new Pet(PetType.valueOf(petType.toUpperCase()), petName); //как сделать выбор?
        vetClinic.addPet(clientId, pet);
        System.out.printf("Pet %s to client %s was successfully added\n", petName, clientName);
    }

    @Override
    public String info() {
        return String.format("Press %d to add new pet to Client", key());
    }
}
