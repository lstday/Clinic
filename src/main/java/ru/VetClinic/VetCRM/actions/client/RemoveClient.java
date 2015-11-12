package ru.VetClinic.VetCRM.actions.client;

import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetAction;
import ru.VetClinic.VetCRM.VetClinic;

/**
 * Created by lstday
 * 03.11.15.
 */
public class RemoveClient implements VetAction {
    @Override
    public int key() {
        return 3;
    }

    @Override
    public void execute(ReadUserInput userInput, VetClinic vetClinic) {
        System.out.printf("Enter client id to remove(from %d to %d)\n", 1, vetClinic.getClientList().size());
        int clientId = userInput.getNumber(1, vetClinic.getClientList().size());
        vetClinic.removeClient(clientId);
        System.out.printf("Client %d successfully removed!\n", clientId);
    }

    @Override
    public String info() {
        return String .format("Press %d to remove client.", key());
    }
}
