package ru.VetClinic.VetCRM.Models;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lstday
 * 22.10.15.
 */

public class Client {
    private String clientName;
    private Map<Integer, Pet> petList = new HashMap<>();
    private String uuid;
    private final static AtomicInteger petsCount = new AtomicInteger(0);

    public Client(String clientName) {
        this.clientName = clientName;
        uuid= UUID.randomUUID().toString();
    }

    public Client(String clientName, Pet pet) {
//        this.clientName = clientName;
//        uuid= UUID.randomUUID().toString();
        this(clientName);
        petList.put(petsCount.incrementAndGet(), pet);
    }

    protected Map<Integer, Pet> getPetList() {
        return petList;
    }

    public String getClientName() {
        return clientName;
    }

    public void removePet(Pet pet) {
        if (isPresent(pet)) {
            for (Map.Entry<Integer, Pet> integerClientEntry : getPetList().entrySet()) {
                if (integerClientEntry.getValue().equals(pet)) {
                    getPetList().remove(integerClientEntry.getKey());
                    break;
                }
            }
        } else {
            System.out.println("We have't this pet.");
        }
    }


    public void addPet(Pet pet) {
        if (!isPresent(pet)) {
            petList.put(petsCount.incrementAndGet(), pet);
        }else {
            System.out.println("This client already have this pet.");
        }
    }

    public boolean isPresent(Pet pet) {
        return getPetList().containsValue(pet);
    }
}


//должны быть чисты от логики
//убрать все методы
//перенести в пакет моделс

//    public Map<Integer, Pet> getAllSickPets() {
//        return petList;
//    }
//    public void removePet(Pet pet) {
//        for (Map.Entry<Integer, Pet> entry : petList.entrySet()) {
//            if (entry.getValue().equals(pet)) {
//                petList.remove(pet);
//            }
//        }
//    }
//    void showAllPetsNames() {
//        System.out.println("There are this clients:");
//        for (Pet pet : getAllPets().values()) {
//            System.out.println(pet.petName);
//        }
//    }
//    public void addPet(Pet pet) {
//        petList.put(petsCount.incrementAndGet(), pet);
//    }
