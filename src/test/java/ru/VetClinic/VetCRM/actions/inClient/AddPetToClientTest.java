package ru.VetClinic.VetCRM.actions.inClient;

import org.junit.Assert;
import org.junit.Test;
import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.actions.client.AddPetToClient;
import ru.VetClinic.VetCRM.models.Client;
import ru.VetClinic.VetCRM.models.Pet;
import ru.VetClinic.VetCRM.models.PetType;

import java.util.Iterator;

/**
 * Created by lstday
 * 03.11.15.
 */
public class AddPetToClientTest {

    @Test
    public void testExecute() throws Exception {
        AddPetToClient addPetToClient = new AddPetToClient();
        VetClinic vetClinic = new VetClinic("asd");
        Client client = new Client("asd");
        vetClinic.addClient(client);
        ReadUserInput userInput = new ReadUserInput() {
            @Override
            public char getAnswer() {
                return 0;
            }

            @Override
            public String getString() {
                return "asd";
            }

            @Override
            public int getNumber(int firstArgOfRange, int secondArgOfRange) {
                return 0;
            }
        };
        addPetToClient.execute(userInput, vetClinic);

        Assert.assertTrue(vetClinic.getClientList().iterator().next().getPetList().iterator().next().getPetName().equals("asd"));
        Assert.assertFalse(vetClinic.getClientList().iterator().next().getPetList().iterator().next().getPetName().equals("dsa"));

    }
}

//        Pet pet1 = new Pet(PetType.CAT, "cat");
//        Pet pet2 = new Pet(PetType.CROCODILE, "crocodile");
//        Pet pet3 = new Pet(PetType.DOG, "dog");
//        VetClinic vetClinic = new VetClinic("asd");
//        Client client1 = new Client("clientName1");
//        Client client2 = new Client("clientName2");
//        vetClinic.addClient(client1);
//        vetClinic.addClient(client2);
//        vetClinic.addPet(client1.getId(), pet1);
//        vetClinic.addPet(client1.getId(), pet2);
//        vetClinic.addPet(client2.getId(), pet3);
//
//        Assert.assertTrue(vetClinic.getClientPets(client1).contains(pet1));
//        Assert.assertTrue(vetClinic.getClientPets(client1).contains(pet2));
//        Assert.assertFalse(vetClinic.getClientPets(client1).contains(pet3));
//        Assert.assertTrue(vetClinic.getClientPets(client2).contains(pet3));
//        Assert.assertFalse(vetClinic.getClientPets(client2).contains(pet1));