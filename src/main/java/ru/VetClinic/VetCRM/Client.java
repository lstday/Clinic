package ru.VetClinic.VetCRM;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lstday
 * 22.10.15.
 */
public class Client {
    String clientName;
    private HashMap<Integer, Pet> petList = new HashMap<>();

    private static final AtomicInteger petsCount = new AtomicInteger(0);

    public Client(String clientName, Pet pet) {
        this.clientName = clientName;
        petList.put(petsCount.incrementAndGet(), pet);
    }

    public void removePet(Pet pet) {
        for (Map.Entry<Integer, Pet> entry : petList.entrySet()) {
            if (entry.getValue().equals(pet)) {
                petList.remove(pet);
            }
        }
    }

    public void addPet(Pet pet) {
        petList.put(petsCount.incrementAndGet(), pet);
    }
}
