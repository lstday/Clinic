package ru.VetClinic.VetCRM;

/**
 * Created by lstday
 * 22.10.15.
 */
public class VetClinicManager {

    VetClinic vetClinic;

    public ReadUserInputImpl userInput = new ReadUserInputImpl();

    public VetClinicManager(VetClinic vetClinic) {
        this.vetClinic = vetClinic;
    }

    /**
     * @param
     */
    public void runVetClinic() {
        System.out.printf("Hello in our Vet Clinic %s, dear Director!\nWant a little work?\n", vetClinic.name);
        showMainMenu();
    }

    protected void showMainMenu() {
        System.out.println("You are in the Main menu. Here you can perform next actions:");
        System.out.println("Press 1 to move in Clients section.");
        System.out.println("Press 2 to move in Pets section.");
        System.out.println("Press 3 to see inbox messages.");
        System.out.println("Press 4 to show About.");
        System.out.println("Press 0 to Exit.");
        int userInputNumber = userInput.getNumber(0, 4);
        switch (userInputNumber) {
            case 1:
                showClientsSection();
                break;
            case 2:
                showPetsSection();
                break;
            case 3:
                showInbox();
                showMainMenu();
                break;
            case 4:
                showAbout();
                showMainMenu();
                break;
            case 0:
                break;
        }
    }

    private void showPetsSection() {
        System.out.println("You are in the Pets Section. Here you can perform next actions:");
        System.out.println("Press 1 to show all pets.");
        System.out.println("Press 2 to show all sick pets.");
        System.out.println("Press 3 remove Pet");
        System.out.println("Press 0 to go back.");
        int userInputNumber = userInput.getNumber(0, 3);
        switch (userInputNumber) {
            case 1:
                showAllPets();
                showPetsSection();
                break;
            case 2:
                showAllSickPets();
                showPetsSection();
                break;
            case 3:
                removePet();
                showMainMenu();
                break;
            case 0:
                showMainMenu();
                break;
        }
    }

    private void showClientsSection() {
        System.out.println("You are in the Clients Section. Here you can perform next actions:");
        System.out.println("Press 1 to show all clients.");
        System.out.println("Press 2 to remove client.");
        System.out.println("Press 3 to remove pet");
        System.out.println("Press 0 to go back.");
        int userInputNumber = userInput.getNumber(0, 3);
        switch (userInputNumber) {
            case 1:
                showAllClients();
                showClientsSection();
                break;
            case 2:
                removeClient();
                showClientsSection();
                break;
            case 3:
                removePet();
                showClientsSection();
                break;
            case 0:
                showMainMenu();
                break;
        }

    }

    private void removePet() {
        System.out.println("plug: removing pet");
    }

    private void showAllSickPets() {
        System.out.println("plug: showing all sick pets");
    }

    private void showAllPets() {
        System.out.println("plug: showing all pets");
    }

    private void removeClient() {
        System.out.println("plug: removing client");
    }

    private void showAllClients() {
        System.out.println("plug: showing all clients");
    }

    private void showAbout() {
        System.out.printf("This is VetCRM(tm) v%s. All Rights Reserved. Ask your questions on sakhar.medovich@gmail.com\n",
                VetCRM.version);
    }

    private void showInbox() {
        System.out.println("plug: showing inbox. Will be realized in version 1.1");
    }

}
