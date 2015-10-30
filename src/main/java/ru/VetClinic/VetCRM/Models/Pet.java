package ru.VetClinic.VetCRM.Models;

import java.util.UUID;

/**
 * Created by lstday
 * 22.10.15.
 */


public class Pet extends Animal {
    private String uuid;
    private String petName;
    private PetType petType;
    private String breed;
    private boolean isSick;


    //<Setters>
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setIsSick(boolean isSick) {
        this.isSick = isSick;
    }
    //</Setters>


    //<Constructors>
    public Pet(PetType petType, String petName) {
        this(petType, petName, UUID.randomUUID().toString());
    }

    public Pet(PetType petType, String petName, String uuid) {
        this.petType = petType;
        this.petName = petName;
        this.uuid = uuid;
    }
    //</Constructors>


    //<Getters>
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

    public String getUuid() {
        return uuid;
    }
    //</Getters>
}

//должна быть ссылка на клиента . не понял, зачем?