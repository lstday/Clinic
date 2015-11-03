package ru.VetClinic.VetCRM;

import ru.VetClinic.VetCRM.models.Client;
import ru.VetClinic.VetCRM.models.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lstday
 * 22.10.15.
 */

//сделать лист вместо карты. +
//в этом вывода нет +
//должен работать по принципу crud
//read find by id
//тесты должны проверять 8 операций

public class VetClinic {

    protected String name;
    private List<Client> clientList = new ArrayList<>();

    public VetClinic(String name) {
        this.name = name;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public String getName() {
        return name;
    }

    public void addPet(String clientId, Pet pet) {
        Client client = findById(clientId);
        client.getPetList().add(pet);
    }

    public void addClient(Client client) {
        getClientList().add(client);
    }

    public Client findById(String clientId) {
        for (Client client : getClientList()) {
            if (Objects.equals(client.getId(), clientId))
                return client;
        }
        return null;
    }

    public Client findByName(String clientName) {
        for (Client client : getClientList()) {
            if (Objects.equals(client.getName(), clientName))
                return client;
        }
        return null;
    }

    public List<Pet> getClientPets(Client client) {
        return client.getPetList();
    }

    public void removeClient(String clientId) {
        for (Client client : getClientList()) {
            if (Objects.equals(client.getId(), clientId))
                getClientList().remove(client);
        }
    }

    public void removePet(String petId) {
        for (Client client : getClientList()) {
            for (Pet pet : client.getPetList()) {
                if (Objects.equals(pet.getId(), petId))
                    client.getPetList().remove(petId);
            }

        }
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
//            if (clientEntry.getValue().getName().equals(name)) {
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

//    public void removeClient(Client client) {
//        if (isPresent(client)) {
//            for (Map.Entry<String, Client> integerClientEntry : clientList.entrySet()) {
//                if (integerClientEntry.getValue().equals(client)) {
//                    clientList.remove(integerClientEntry.getKey());
//                    break;
//                }
//            }
//        } else {
//            System.out.println("We have't this client.");
//        }
//    }
//
//    public void addPet(Pet pet) {
//        if (!isPresent(pet)) {
//            petList.put(pet.getUuid(), pet);
//        } else {
//            System.out.println("This client already have this pet.");
//        }
//    }
//
//    public void removePet(Pet pet) {
//        if (isPresent(pet)) {
//            for (Map.Entry<String, Pet> integerClientEntry : getPetList().entrySet()) {
//                if (integerClientEntry.getValue().equals(pet)) {
//                    getPetList().remove(integerClientEntry.getKey());
//                    break;
//                }
//            }
//        } else {
//            System.out.println("We have't this pet.");
//        }
//    }
//
//
//    public void addClient(Client client) {
//        if (!isPresent(client)) {
//            clientList.put(client.getUuid(), client);
//        } else {
//            System.out.println("We already have this client.");
//        }
//    }
//
//    public boolean isPresent(Client client) {
//        return getClientList().containsValue(client);
//    }//убрать