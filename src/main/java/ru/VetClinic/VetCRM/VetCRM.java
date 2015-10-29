package ru.VetClinic.VetCRM;

/**
 * Created by lstday
 * 23.10.15.
 */
public class VetCRM {
    public static final String version = "0.03, pre-aplha";

    /**
     * Put here your clinic with petName. Name will be used.
     * Runs your Clinic. Can two or three.
     * */
    public static void main(String[] args) { //TODO Every one instance of Clinic Must be live in it's own thread. In the near term.
        VetClinic aibolit = new VetClinic("Aibolit");
        VetClinicManager manager = new VetClinicManager(aibolit);
        manager.runVetClinic();
    }
}
