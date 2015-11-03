package ru.VetClinic.VetCRM.models;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lstday
 * 22.10.15.
 */

public class Pet extends Animal {
    private String id;
    private String petName;
    private PetType petType;
    private String breed;
    private boolean isSick;

    private static final AtomicInteger petCounter = new AtomicInteger(0);


    public Pet(PetType petType, String petName) {
        this.petType = petType;
        this.petName = petName;
        this.id = String.valueOf(petCounter.incrementAndGet());
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setIsSick(boolean isSick) {
        this.isSick = isSick;
    }

    public String getPetName() {
        return petName;
    }

    public PetType getPetType() {
        return petType;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isSick() {
        return isSick;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public String getId() {
        return id;
    }
}

//должна быть ссылка на клиента . не понял, зачем?