package ru.VetClinic.VetCRM;

import junit.framework.Assert;
import org.junit.Test;
import ru.VetClinic.VetCRM.Models.Client;
import ru.VetClinic.VetCRM.Models.Pet;
import ru.VetClinic.VetCRM.Models.PetType;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

/**
 * Created by lstday
 * 30.10.15.
 */
public class VetClinicTest {


    @Test
    public void testRemoveClient() throws Exception {
//        Pet pet1 = new Pet(PetType.CAT, "cat");
//        Pet pet2 = new Pet(PetType.CROCODILE, "crocodile");
//        Pet pet3 = new Pet(PetType.DOG, "dog");
//        client1.addPet(pet1);
//        client1.addPet(pet2);
//        client2.addPet(pet3);
//        Map<Integer, Client> clientHashMap = new HashMap<>();
//        clientHashMap.put(clientCount.incrementAndGet(), client1);
//        clientHashMap.put(clientCount.incrementAndGet(), client2);
//        final AtomicInteger clientCount = new AtomicInteger(0);
//        vetClinic.removeClient(client2);
//        Assert.assertTrue(vetClinic.isPresent(client2));

        VetClinic vetClinic = new VetClinic("asd");
        Client client1 = new Client("clientName1");
        Client client2 = new Client("clientName2");
        vetClinic.addClient(client1);
        vetClinic.addClient(client2);
        vetClinic.removeClient(client1);
        Assert.assertFalse(vetClinic.getClientList().containsValue(client1));
        Assert.assertTrue(vetClinic.getClientList().containsValue(client2));
    }

    @Test
    public void testAddClient() throws Exception {

//        Pet pet1 = new Pet(PetType.CAT, "cat");
//        Pet pet2 = new Pet(PetType.CROCODILE, "crocodile");
//        Pet pet3 = new Pet(PetType.DOG, "dog");
//        client1.addPet(pet1);
//        client1.addPet(pet2);
//        client2.addPet(pet3);

        final AtomicInteger clientCount = new AtomicInteger(0);
        VetClinic vetClinic = new VetClinic("asd");

        Client client1 = new Client("clientName1");
        Client client2 = new Client("clientName2");
        Map<Integer, Client> clientHashMap = new HashMap<>();

        clientHashMap.put(clientCount.incrementAndGet(), client1);
        clientHashMap.put(clientCount.incrementAndGet(), client2);

        Assert.assertTrue(clientHashMap.containsValue(client2));

    }

    @Test
    public void testIsPresent() throws Exception {
        final AtomicInteger clientCount = new AtomicInteger(0);
        VetClinic vetClinic = new VetClinic("asd");

        Client client1 = new Client("clientName1");
        Client client2 = new Client("clientName2");
//        Map<Integer, Client> clientHashMap = new HashMap<>();
//        clientHashMap.put(clientCount.incrementAndGet(), client1);
//        clientHashMap.put(clientCount.incrementAndGet(), client2);
        vetClinic.addClient(client2);
        Assert.assertFalse(vetClinic.isPresent(client1));
        Assert.assertTrue(vetClinic.isPresent(client2));

    }
}