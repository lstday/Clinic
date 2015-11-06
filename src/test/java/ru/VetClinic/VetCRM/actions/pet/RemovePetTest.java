package ru.VetClinic.VetCRM.actions.pet;

import junit.framework.Assert;
import org.junit.Test;
import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.models.Client;
import ru.VetClinic.VetCRM.models.Pet;
import ru.VetClinic.VetCRM.models.PetType;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by lstday
 * 06.11.15.
 */
public class RemovePetTest {

    @Test
    public void testExecute() throws Exception {
        RemovePet removePet = new RemovePet();


        VetClinic vetClinic = new VetClinic("asd");
        Client client = new Client("client");
        vetClinic.addClient(client);

        Pet pet1 = new Pet(PetType.CAT, "cat");
        Pet pet2 = new Pet(PetType.DOG, "dog");
        vetClinic.addPet(client.getId(), pet1);
        vetClinic.addPet(client.getId(), pet2);

        final Iterator<String> answer = Arrays.asList(vetClinic.findPetByName(client, "cat").getUid()).iterator();

        ReadUserInput userInput = new ReadUserInput() {
            @Override
            public char getAnswer() {
                return 0;
            }

            @Override
            public String getString() {
                return answer.next();
            }

            @Override
            public int getNumber(int firstArgOfRange, int secondArgOfRange) {
                return 0;
            }
        };
        removePet.execute(userInput, vetClinic);

        Assert.assertFalse(client.getPetList().contains(pet1));
        Assert.assertTrue(client.getPetList().contains(pet2));
    }
}