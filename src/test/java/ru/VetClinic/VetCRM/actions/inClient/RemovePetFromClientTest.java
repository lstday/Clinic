package ru.VetClinic.VetCRM.actions.inClient;

import junit.framework.Assert;
import org.junit.Test;
import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.actions.client.RemovePetFromClient;
import ru.VetClinic.VetCRM.models.Client;
import ru.VetClinic.VetCRM.models.Pet;
import ru.VetClinic.VetCRM.models.PetType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lstday
 * 03.11.15.
 */
public class RemovePetFromClientTest {

    @Test
    public void testExecute() throws Exception {
        VetClinic vetClinic = new VetClinic("asd");

        RemovePetFromClient removePetFromClient = new RemovePetFromClient();

        Client client1 = new Client("client");
        vetClinic.addClient(client1);
        Pet pet1 = new Pet(PetType.CAT, "cat");
        Pet pet2 = new Pet(PetType.DOG, "dog");
        vetClinic.addPet(client1.getId(), pet1);
        vetClinic.addPet(client1.getId(), pet2);

//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("client");
//        arrayList.add("cat");
//
//        final Iterator<String> iterator = arrayList.iterator();
        final Iterator<String> answer = Arrays.asList("client", "cat").iterator();

        ReadUserInput userInput = new ReadUserInput() {
            @Override
            public char getAnswer() {
                return 0;
            }

            @Override
            public String getString() {
                return answer.next();
//                return iterator.next();
            }

            @Override
            public int getNumber(int firstArgOfRange, int secondArgOfRange) {
                return 0;
            }
        };

        removePetFromClient.execute(userInput, vetClinic);
        Assert.assertFalse(vetClinic.getClientPets(client1).contains(pet1));
        Assert.assertTrue(vetClinic.getClientPets(client1).contains(pet2));

    }

}

//        Assert.assertFalse(vetClinic.getClientList().contains(pet2));
//        Assert.assertTrue(vetClinic.getClientList().contains(pet3));

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
//        vetClinic.removePet(pet1.getId());
//        vetClinic.removePet(pet2.getId());
//
//        for (Client client : vetClinic.getClientList()) {
//            Assert.assertFalse(client.getPetList().contains(pet1));