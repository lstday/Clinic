package ru.VetClinic.VetCRM;

import java.util.HashMap;
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


    private static final AtomicInteger clientCount = new AtomicInteger(0);
    private final HashMap<Integer, Client> clientList = new HashMap<>();

    public VetClinic(String name) {
        this.name = name;
    }




//    public void addClient(final Client client) {
//        clientList.put(clientCount.incrementAndGet(), client);
//    }
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
