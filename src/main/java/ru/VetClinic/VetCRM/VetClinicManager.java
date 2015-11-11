package ru.VetClinic.VetCRM;

import ru.VetClinic.VetCRM.actions.client.*;
import ru.VetClinic.VetCRM.actions.menu.ShowAbout;
import ru.VetClinic.VetCRM.actions.menu.ShowClientSection;
import ru.VetClinic.VetCRM.actions.menu.ShowPetSection;
import ru.VetClinic.VetCRM.actions.pet.HealthSwitcher;
import ru.VetClinic.VetCRM.actions.pet.RemovePet;
import ru.VetClinic.VetCRM.actions.pet.ShowAllPets;
import ru.VetClinic.VetCRM.actions.pet.ShowAllSickPets;

/**
 * Created by lstday
 * 22.10.15.
 */

//универсальный интерфейс actions - readuserinput
public class VetClinicManager {

    VetClinic vetClinic;

    private ReadUserInputImpl userInput = new ReadUserInputImpl();

    public VetClinicManager(VetClinic vetClinic) {
        this.vetClinic = vetClinic;
    }

    public void fillActions() {
        vetClinic.loadMenuAction(new ShowClientSection());
        vetClinic.loadMenuAction(new ShowPetSection());
        vetClinic.loadMenuAction(new ShowAbout());

        vetClinic.loadClientAction(new ShowAllClients());
        vetClinic.loadClientAction(new AddClient());
        vetClinic.loadClientAction(new RemoveClient());
        vetClinic.loadClientAction(new ShowPetsOfClient());
        vetClinic.loadClientAction(new RemovePetFromClient());
        vetClinic.loadClientAction(new AddPetToClient());
        vetClinic.loadClientAction(new GoBack());

        vetClinic.loadPetAction(new ShowAllPets());
        vetClinic.loadPetAction(new ShowAllSickPets());
        vetClinic.loadPetAction(new RemovePet());
        vetClinic.loadPetAction(new HealthSwitcher());
        vetClinic.loadPetAction(new GoBack());
    }

    public void runVetClinic() {
        System.out.printf("Hello in our Vet Clinic %s, dear Director!\nWant a little work?\n", vetClinic.getName());
        fillActions();
        showMainMenu();
    }

    protected void showMainMenu() {
        for (VetAction vetAction : vetClinic.getMenuActions()) {
            System.out.println(vetAction.info());
        }

        int userInputNumber = userInput.getNumber(0, vetClinic.getMenuActions().size());
        if (userInputNumber == 1)
        {
            showClientsSection();
            showMainMenu();
        }
        else {
            showPetsSection();
            showMainMenu();
        }
//        for (VetAction vetAction : vetClinic.getMenuActions()) {
//            if (userInputNumber == vetAction.key()) {
//                vetAction.execute(userInput, vetClinic);
//            }
//        }
    }

    private void showPetsSection() {
        for (VetAction vetAction : vetClinic.getPetActions()) {
            System.out.println(vetAction.info());
        }
        int userInputNumber = userInput.getNumber(0, vetClinic.getPetActions().size());

    }

    private void showClientsSection() {
        for (VetAction vetAction : vetClinic.getClientActions()) {
            System.out.println(vetAction.info());
        }
        int userInputNumber = userInput.getNumber(0, vetClinic.getClientActions().size());
        for (VetAction vetAction : vetClinic.getClientActions()) {
            if (userInputNumber == vetAction.key()) {
                vetAction.execute(userInput, vetClinic);
            }
        }

    }
}

//        switch (userInputNumber) {
//            case 1:
//                showClientsSection();
//                break;
//            case 2:
//                showPetsSection();
//                break;
//            case 3:
//                showInbox();
//                showMainMenu();
//                break;
//            case 4:
//                showAbout();
//                showMainMenu();
//                break;
//            case 0:
//                break;
//        }
//        switch (userInputNumber) {
//            case 1:
//                showClientsSection();
//                break;
//            case 2:
//                showPetsSection();
//                break;
//            case 3:
//                showInbox();
//                showMainMenu();
//                break;
//            case 4:
//                showAbout();
//                showMainMenu();
//                break;
//            case 0:
//                break;
//        }

//    private void addClient() {
//        System.out.println("Enter petName:");
//        String newClientName = userInput.getString();
////        vetClinic.addClient(newClientName); //TODO написано, протестировать
//    }
//
//    private void removeClient() {
//        System.out.println("Enter the petName of Client to remove:");
//        String clientToRemove = userInput.getString();
////        vetClinic.removeClient(clientToRemove);
//    }
//
////    private void showAllClientsNames() {
////        vetClinic.showAllClientsNames();
////    }
//
//    private void showAbout() {
//        System.out.printf("This is VetCRM(tm) v%s. All Rights Reserved. Ask your questions on sakhar.medovich@gmail.com\n",
//                VetCRM.version);
//    }
//
//    private void showInbox() {
//        System.out.println("plug: showing inbox. Will be realized in version 1.1");
//    }

//    private void showAllSickPets() {
//        vetClinic.showAllSickPets();
//    }

//    private void showAllPets() {
//        vetClinic.showAllPets();
//    }

//    private void removePet() {
//        System.out.println("Enter the petName of Pet to remove:");
//        String petToRemove = userInput.getString();
////        vetClinic.removePet(petToRemove);
//    }

//        switch (userInputNumber) {
//            case 1:
//                //showAllClientsNames();
//                showClientsSection(); //+
//                break;
//            case 2:
//                addClient(); //+
//                showClientsSection();
//                break;
//            case 3:
//                removeClient();
//                showClientsSection();
//                break;
//            case 4:
//                removePet();
//                showClientsSection();
//                break;
//            case 0:
//                showMainMenu();
//                break;
//        }
