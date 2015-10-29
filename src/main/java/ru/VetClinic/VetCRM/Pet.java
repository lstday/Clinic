package ru.VetClinic.VetCRM;

import java.util.UUID;

/**
 * Created by lstday
 * 22.10.15.
 */
public class Pet extends Animal {
    final String petName;
    final String id;
    String breed;
    PetType petType;
    boolean isSick;

    public Pet(String petName, PetType petType) {
        this.petName = petName;
        this.petType = petType;
        id = String.valueOf(UUID.randomUUID());
    }
}
