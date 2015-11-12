package ru.VetClinic.VetCRM.actions.client;

import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetAction;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.models.Client;

/**
 * Created by lstday
 * 03.11.15.
 */
public class ShowAllClients implements VetAction {
    @Override
    public int key() {
        return 1;
    }

    @Override
    public void execute(ReadUserInput userInput, VetClinic vetClinic) {
        if (vetClinic.getClientList().isEmpty()) System.out.println("We have't clients!");
        else {
            System.out.println("There are this clients:");
            for (Client client : vetClinic.getClientList()) {
                System.out.println(client.getId() + " " + client.getName());
            }
        }
    }

    @Override
    public String info() {
        return String.format("Press %d to show all clients.", key());
    }
}
