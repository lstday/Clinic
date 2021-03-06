package ru.VetClinic.VetCRM.models;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lstday
 * 22.10.15.
 */

//убрать логику всё брать, конструкторы можно оставить.
//сделать только геттеры и сетеры
// порядок: переменные-конструкторы-поля
public class Client {
    private String name; //нет смысла так называть
    private List<Pet> petList = new ArrayList<>();
    private int id;
    private static final AtomicInteger clientCounter = new AtomicInteger(0);

    public Client(String name) {
        this.name = name;
        this.id = clientCounter.incrementAndGet();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Pet> getPetList() {
        return petList;
    }

    public int getId() {
        return id;
    }

}


//должны быть чисты от логики
//убрать все методы
//перенести в пакет моделс
//    public boolean isPresent(Pet pet) {
//        return getPetList().containsValue(pet);
//    }

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
//    public Client(String name) {
//        this.name = name;
//        id = UUID.randomUUID().toString();
//    }
//
//    public Client(String name, Pet pet) {
//        this(name);
//        petList.put(pet.getId(), pet);
//    }
//    private Map<String, Pet> petList = new HashMap<>(); //нет смысла так называть
