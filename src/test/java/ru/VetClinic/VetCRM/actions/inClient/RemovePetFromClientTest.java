package ru.VetClinic.VetCRM.actions.inClient;

import junit.framework.Assert;
import org.junit.Test;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.models.Client;
import ru.VetClinic.VetCRM.models.Pet;
import ru.VetClinic.VetCRM.models.PetType;

import static org.junit.Assert.*;

/**
 * Created by lstday
 * 03.11.15.
 */
public class RemovePetFromClientTest {

    @Test
    public void testExecute() throws Exception {
        Pet pet1 = new Pet(PetType.CAT, "cat");
        Pet pet2 = new Pet(PetType.CROCODILE, "crocodile");
        Pet pet3 = new Pet(PetType.DOG, "dog");
        VetClinic vetClinic = new VetClinic("asd");
        Client client1 = new Client("clientName1");
        Client client2 = new Client("clientName2");
        vetClinic.addClient(client1);
        vetClinic.addClient(client2);
        vetClinic.addPet(client1.getId(), pet1);
        vetClinic.addPet(client1.getId(), pet2);
        vetClinic.addPet(client2.getId(), pet3);

        vetClinic.removePet(pet1.getId());
        vetClinic.removePet(pet2.getId());

        //Как это проверяется?!


//        for (Client client : vetClinic.getClientList()) {
//            Assert.assertFalse(client.getPetList().contains(pet1));
//        }
//        Assert.assertFalse(vetClinic.getClientList().contains(pet2));
//        Assert.assertTrue(vetClinic.getClientList().contains(pet3));
    }
}