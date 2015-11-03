package ru.VetClinic.VetCRM.models;

import junit.framework.Assert;
import org.junit.Test;
import ru.VetClinic.VetCRM.VetClinic;

/**
 * Created by lstday
 * 30.10.15.
 */
public class ClientTest {

    @Test
    public void testGetClientName() throws Exception {
        VetClinic vetClinic = new VetClinic("asd");
        Client client1 = new Client("clientName1");
        Assert.assertEquals(client1.getName(), "clientName1");
    }

    @Test
    public void testRemovePet() throws Exception {
        Pet pet1 = new Pet(PetType.CAT, "cat");
        Pet pet2 = new Pet(PetType.CROCODILE, "crocodile");
        Pet pet3 = new Pet(PetType.DOG, "dog");
        VetClinic vetClinic = new VetClinic("asd");
        Client client1 = new Client("clientName1");
        client1.addPet(pet1);
        client1.addPet(pet2);
        Client client2 = new Client("clientName2");
        client2.addPet(pet3);
        client1.removePet(pet2);
        client2.removePet(pet3);
        Assert.assertFalse(client1.getPetList().containsValue(pet2));
        Assert.assertFalse(client2.getPetList().containsValue(pet3));
    }

    @Test
    public void testAddPet() throws Exception {
        Pet pet1 = new Pet(PetType.CAT, "cat");
        Pet pet2 = new Pet(PetType.CROCODILE, "crocodile");
        Pet pet3 = new Pet(PetType.DOG, "dog");
        VetClinic vetClinic = new VetClinic("asd");
        Client client1 = new Client("clientName1");
        Client client2 = new Client("clientName2");

        client1.addPet(pet1);
        client1.addPet(pet2);
        client2.addPet(pet3);

        Assert.assertTrue(client1.getPetList().containsValue(pet1));
        Assert.assertFalse(client1.getPetList().containsValue(pet3));
        Assert.assertTrue(client2.getPetList().containsValue(pet3));
    }

    @Test
    public void testIsPresent() throws Exception {
        Pet pet1 = new Pet(PetType.CAT, "cat");
        Pet pet2 = new Pet(PetType.CROCODILE, "crocodile");
        Pet pet3 = new Pet(PetType.DOG, "dog");
        VetClinic vetClinic = new VetClinic("asd");
        Client client1 = new Client("clientName1");
        Client client2 = new Client("clientName2");
        client1.addPet(pet1);
        client1.addPet(pet2);
        client2.addPet(pet3);

        Assert.assertTrue(client1.isPresent(pet1));
        Assert.assertFalse(client1.isPresent(pet3));
        Assert.assertTrue(client2.isPresent(pet3));
        Assert.assertFalse(client2.isPresent(pet1));


    }
}