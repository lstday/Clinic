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
        System.out.println("There are this clients:");
        for (Client client : vetClinic.getClientList()) {
            System.out.println(client.getId() + " " + client.getName());
        }
    }

    @Override
    public String info() {
        return "Press 1 to show all clients.";
    }
}
