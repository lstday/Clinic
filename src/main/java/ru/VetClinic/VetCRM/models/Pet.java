package ru.VetClinic.VetCRM.models;

import ru.VetClinic.VetCRM.RandomUID;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lstday
 * 22.10.15.
 */

public class Pet extends Animal { //TODO придумать уникальный id для удобного удаления
    private int id;
    private String uid;
    private String petName;
    private PetType petType;
    private String breed;
    private boolean isSick;

    private static final AtomicInteger petCounter = new AtomicInteger(0);


    public Pet(PetType petType, String petName) {
        this.petType = petType;
        this.petName = petName;
        this.id = petCounter.incrementAndGet();
        this.uid = RandomUID.getInstance().uidRandomizer();
    }

    public String getUid() {
        return uid;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void switchHealth() {
        this.isSick = !isSick;
    }

    public String getPetName() {
        return petName;
    }

    public PetType getPetType() {
        return petType;
    }

    public boolean isSick() {
        return isSick;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public int getId() {
        return id;
    }
}
