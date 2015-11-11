package ru.VetClinic.VetCRM.models;

/**
 * Created by lstday
 * 22.10.15.
 */
public enum PetType {
    DOG,
    CAT,
    FISH,
    CROCODILE,
    UNKNOWNMONSTER;

    public static boolean contains(String userpetType) {
        for (PetType petType : PetType.values()) {
            if (userpetType.equalsIgnoreCase(String.valueOf(petType))) return true;
        }
        return false;
    }
}
