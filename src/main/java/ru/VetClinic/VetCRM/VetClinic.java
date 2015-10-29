package ru.VetClinic.VetCRM;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lstday
 * 22.10.15.
 */

/**
 * Vetclinic with its logic
 */
public class VetClinic {
    protected String name;

    private AtomicInteger clientCount = new AtomicInteger(0);
    private Map<Integer, Client> clientList = new HashMap<>();

    public VetClinic(String name) {
        this.name = name;
    }

    void removeClient(String clientToRemove) {
        if (haveThisClients(clientToRemove)) {
            System.out.println("We find next clients:");
            for (Map.Entry<Integer, Client> clientEntry : clientList.entrySet()) {
                System.out.printf(clientEntry.getKey() + " " + clientEntry.getValue().clientName+"\n"); //TODO Вывести в красивом виде, с шапкой
            }
            System.out.printf("Press key to remove");
            //TODO как реализовать, ведь в этом классе нет работы со вводом?

            System.out.printf("Client %s was removed", clientToRemove);
        } else {
            System.out.println("We have't Client with tis name!");
        }

    }

    protected Map<Integer, Client> getAllClients() {//TODO написано, протестировать
        return clientList;
    }

    void showAllClientsNames() { //TODO написано, протестировать
        System.out.println("There are this clients:");
        for (Client client : getAllClients().values()) {
            System.out.println(client.clientName);
        }
//        for (Map.Entry<Integer, Client> clientEntry : clientList.entrySet()) {
//            System.out.println(clientEntry.getKey()+" "+clientEntry.getValue().clientName);
//        }
    }

    protected boolean haveThisClients(String name) {
//        return getAllClients().containsValue(name); //TODO метод явно не рабочий, гуглить
        return true;
    }

    protected void showAllPets() {
        System.out.println("plug: showing all pets");
    }

    public void removePet(String petToRemove) {
    }

    public void showAllSickPets() {

    }

    public void addClient(String clientName) {
//        clientList.put(clientCount.incrementAndGet(), new Client(clientName));
        clientList.put(clientCount.incrementAndGet(), new Client(clientName));
        System.out.println("Client successfully added!");
    }
//
//    public Client[] findClientsByPetName(final String name) { //TODO сделать
//        return null;
//    }
//
//    public String[] getPetNames(Client client){ //TODO сделать
//        return null;
//    }
//
//    public void removeClient(Client client) { //TODO сделать
//
//    }
//    public void showClients() {
//        for (HashMap.Entry<Integer, Client> entry: clientList.entrySet()) {
//            System.out.println(entry.getValue().clientName);
//        }
//    }

}
