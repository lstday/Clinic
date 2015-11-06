package ru.VetClinic.VetCRM.actions.client;

import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetAction;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.models.Client;

/**
 * Created by lstday
 * 03.11.15.
 */
public class AddClient implements VetAction {
    @Override
    public int key() {
        return 2;
    }

    @Override
    public void execute(ReadUserInput userInput, VetClinic vetClinic) {
        System.out.println("Enter client name:");
        String clientName = userInput.getString();
        Client client = new Client(clientName);
        vetClinic.addClient(client);
        System.out.printf("Client %s successfully added!\n", clientName);
    }

    @Override
    public String info() {
        return String.format("Press %d to add client", key());
    }
}
