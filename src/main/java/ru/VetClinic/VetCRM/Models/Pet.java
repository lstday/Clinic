package ru.VetClinic.VetCRM.Models;

import java.util.UUID;

/**
 * Created by lstday
 * 22.10.15.
 */


public class Pet extends Animal {
    //    Client client; //а Зачем?
    private String uuid;
    private String petName;
    private PetType petType;
    private String breed;
    private boolean isSick;

    public Pet(PetType petType, String petName) {
        this(petType, petName, UUID.randomUUID().toString());
    }

    public Pet(PetType petType, String petName, String uuid) {
        this.petType = petType;
        this.petName = petName;
        this.uuid = uuid;
    }
}

//должна быть ссылка на клиента +