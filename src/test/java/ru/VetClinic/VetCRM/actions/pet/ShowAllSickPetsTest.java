package ru.VetClinic.VetCRM.actions.pet;

import org.junit.Test;
import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.models.Client;
import ru.VetClinic.VetCRM.models.Pet;
import ru.VetClinic.VetCRM.models.PetType;

/**
 * Created by lstday
 * 05.11.15.
 */
public class ShowAllSickPetsTest { //TODO how to test this?

    @Test
    public void testExecute() throws Exception {
        ShowAllSickPets allSickPets = new ShowAllSickPets();
        VetClinic vetClinic = new VetClinic("asd");

        ReadUserInput userInput = new ReadUserInput() {
            @Override
            public char getAnswer() {
                return 0;
            }

            @Override
            public String getString() {
                return null;
            }

            @Override
            public int getNumber(int firstArgOfRange, int secondArgOfRange) {
                return 0;
            }
        };

        Client client1 = new Client("client1");
        Client client2 = new Client("client2");
        vetClinic.addClient(client1);
        vetClinic.addClient(client2);
        Pet pet1 = new Pet(PetType.CAT, "cat");
        Pet pet2 = new Pet(PetType.DOG, "dog");
        Pet pet3 = new Pet(PetType.CROCODILE, "croco");
        Pet pet4 = new Pet(PetType.FISH, "fish");
        vetClinic.addPet(client1.getId(), pet1);
        vetClinic.addPet(client1.getId(), pet2);
        vetClinic.addPet(client2.getId(), pet3);
        vetClinic.addPet(client2.getId(), pet4);

        pet1.setSick(true);
        pet4.setSick(true);

        allSickPets.execute(userInput, vetClinic);
    }
}