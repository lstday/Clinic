package ru.VetClinic.VetCRM.Models;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by lstday
 * 22.10.15.
 */

public class Client {
    private String clientName;
    private Map<String, Pet> petList = new HashMap<>();
    private String uuid;

    public void addPet(Pet pet) {
        if (!isPresent(pet)) {
            petList.put(pet.getUuid(), pet);
        } else {
            System.out.println("This client already have this pet.");
        }
    }

    public void removePet(Pet pet) {
        if (isPresent(pet)) {
            for (Map.Entry<String, Pet> integerClientEntry : getPetList().entrySet()) {
                if (integerClientEntry.getValue().equals(pet)) {
                    getPetList().remove(integerClientEntry.getKey());
                    break;
                }
            }
        } else {
            System.out.println("We have't this pet.");
        }
    }

    public boolean isPresent(Pet pet) {
        return getPetList().containsValue(pet);
    }

    //<Constructors>
    public Client(String clientName) {
        this.clientName = clientName;
        uuid = UUID.randomUUID().toString();
    }

    public Client(String clientName, Pet pet) {
        this(clientName);
        petList.put(pet.getUuid(), pet);
    }
    //</Constructors>


    //<Getters>
    public String getUuid() {
        return uuid;
    }

    protected Map<String, Pet> getPetList() {
        return petList;
    }

    public String getClientName() {
        return clientName;
    }
    //</Getters>

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
