package ru.VetClinic.VetCRM;

import ru.VetClinic.VetCRM.Models.Client;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lstday
 * 22.10.15.
 */

public class VetClinic {
    protected String name;
    private Map<Integer, Client> clientList = new HashMap<>();
    private final static AtomicInteger clientCount = new AtomicInteger(0);

    public VetClinic(String name) {
        this.name = name;
    }

    protected Map<Integer, Client> getClientList() {
        return clientList;
    }

    public void removeClient(Client client) {
        if (isPresent(client)) {
            for (Map.Entry<Integer, Client> integerClientEntry : clientList.entrySet()) {
                if (integerClientEntry.getValue().equals(client)) {
                    clientList.remove(integerClientEntry.getKey());
                    break;
                }
            }
        } else {
            System.out.println("We have't this client.");
        }
    }

    public void addClient(Client client) {
        if (!isPresent(client)) {
            clientList.put(clientCount.incrementAndGet(), client);
        } else {
            System.out.println("We already have this client.");
        }
    }

    public boolean isPresent(Client client) {
        return getClientList().containsValue(client);
    }

}

//    public void addClient(String clientName) {
//        clientList.put(clientCount.incrementAndGet(), new Client(clientName));
//        System.out.println("Client successfully added!");
//    }

//
//    public void showAllSickPets() {
//        System.out.println("plug: coming soon.");
//    }

//должны быть методы:
//логика по добавлению, получению данных
//добавление клиента, животного
//никаких шоу, только отдаёт
//два каунтера клиентсайди,

//    protected boolean haveThisClients(String name) { //TODO написано, протестировать
//        for (Map.Entry<Integer, Client> clientEntry : getAllClients().entrySet()) {
//            if (clientEntry.getValue().getClientName().equals(name)) {
//                return true;
//            }
//        }
//        return false;
//    }

//
//    public Client[] findClientsByPetName(final String petName) { //TODO сделать
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

//    void removeClient(String clientToRemove) { //TODO метод не работает, нужны операции ввода, которого здесь нет
//        if (!haveThisClients(clientToRemove)) {
//            System.out.println("We have't Client with tis petName!");
//        } else {
//            System.out.println("We find next clients:");
//            for (Map.Entry<Integer, Client> clientEntry : getAllClients().entrySet()) {
//                System.out.printf(clientEntry.getKey() + " " + clientEntry.getValue().clientName + "\n"); //TODO Вывести в красивом виде, с шапкой
//            }
//            System.out.printf("Press key to remove");
//            //TODO как реализовать, ведь в этом классе нет работы со вводом?
//
//            System.out.printf("Client %s was removed", clientToRemove);
//        }
//    }

//    void showAllClientsNames() { //TODO написано, протестировать
//        System.out.println("There are this clients:");
//        for (Client client : getAllClients().values()) {
//            System.out.println(client.clientName);
//        }
//        for (Map.Entry<Integer, Client> clientEntry : clientList.entrySet()) {
//            System.out.println(clientEntry.getKey()+" "+clientEntry.getValue().clientName);
//        }
//    }

//    protected void showAllPets() { //TODO написано, протестировать
//        getAllClients().values().forEach(Client::showAllPetsNames);
//    }
