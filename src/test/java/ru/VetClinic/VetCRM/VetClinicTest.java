package ru.VetClinic.VetCRM;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.VetClinic.VetCRM.models.Client;
import ru.VetClinic.VetCRM.models.Pet;
import ru.VetClinic.VetCRM.models.PetType;

import static org.junit.Assert.*;

/**
 * Created by lstday
 * 06.11.15.
 */
public class VetClinicTest {
    VetClinic vetClinic = new VetClinic("asd");

    @Before
    public void dropAll() throws Exception {
        vetClinic =  new VetClinic(RandomUID.getInstance().uidRandomizer());
    }

    @Test
    public void testGetClientActions() throws Exception {

    }

    @Test
    public void testGetPetActions() throws Exception {

    }

    @Test
    public void testLoadPetAction() throws Exception {

    }

    @Test
    public void testLoadClientAction() throws Exception {

    }

    @Test
    public void testGetClientList() throws Exception {

    }

    @Test
    public void testAddPet() throws Exception {
        Client client = new Client("client");
        Pet pet = new Pet(PetType.CAT, "cat");
        Pet pet2 = new Pet(PetType.CAT, "cat");
        vetClinic.addClient(client);
        vetClinic.addPet(client.getId(), pet);
        Assert.assertTrue(vetClinic.getClientList().iterator().next().getPetList().iterator().next().equals(pet));
        Assert.assertFalse(vetClinic.getClientList().iterator().next().getPetList().iterator().next().equals(pet2));
    }

    @Test
    public void testAddClient() throws Exception {
        Client client = new Client("client");
        vetClinic.addClient(client);
        Assert.assertTrue(vetClinic.getClientList().contains(client));
    }

    @Test
    public void testFindClientById() throws Exception {
        Client client = new Client("client");
        vetClinic.addClient(client);
        Assert.assertEquals(vetClinic.findClientById(client.getId()), client);
    }

    @Test
    public void testFindClientByName() throws Exception {

    }

    @Test
    public void testFindPetByName() throws Exception {

    }

    @Test
    public void testFindPetByUID() throws Exception {

    }

    @Test
    public void testGetClientPets() throws Exception {

    }

    @Test
    public void testRemoveClient() throws Exception {

    }

    @Test
    public void testRemovePet() throws Exception {

    }
}