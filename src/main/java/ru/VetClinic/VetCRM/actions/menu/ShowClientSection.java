package ru.VetClinic.VetCRM.actions.menu;

import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetAction;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.VetClinicManager;

/**
 * Created by lstday
 * 06.11.15.
 */
public class ShowClientSection implements VetAction{
    @Override
    public int key() {
        return 1;
    }

    @Override
    public void execute(ReadUserInput userInput, VetClinic vetClinic) {
//        try {
//            VetClinicManager vcm = new VetClinicManager(vetClinic);
//            vcm.getClass().getMethod("showClientsSection", null);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public String info() {
        return String.format("Press %d to show Client sections", key());
    }
}
