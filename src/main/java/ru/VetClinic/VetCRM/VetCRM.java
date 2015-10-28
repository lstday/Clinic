package ru.VetClinic.VetCRM;

/**
 * Created by lstday
 * 23.10.15.
 */
public class VetCRM {
    public static VetClinicManager manager = new VetClinicManager();

    /**
     * Put here your clinic with name. Name will be used.
     * Runs your Clinic.
     * */
    public static void main(String[] args) { //TODO Every one instance of Clinic Must be live in it's own thread. In the near term.
        manager.runVetClinic("Aibolit");
    }

}
