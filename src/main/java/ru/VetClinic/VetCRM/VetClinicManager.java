package ru.VetClinic.VetCRM;

/**
 * Created by lstday
 * 22.10.15.
 */
public class VetClinicManager {
    public ReadUserInputImpl userInput = new ReadUserInputImpl(); //TODO - если будет многопоточность(в том числе и окна), где лучше разместить объект?

    /**
     * @param clinicName - name of your clinic, will be used/
     */
    public void runVetClinic(String clinicName) {
        VetClinic vetClinic = new VetClinic(clinicName);

        System.out.printf("Hello in our Vet Clinic %s, dear Director!\nWant a little work?\n", clinicName.getClass().getSimpleName());
        askWhatUserWant(clinicName);
    }

    private void askWhatUserWant(String clinicName) {
        System.out.println("In our VetCRM(tm) you can perform next actions:");
        System.out.println("Press 1 to move in Clients section.");
        System.out.println("Press 2 to move in Pets section.");
        System.out.println("Press 3 to see inbox messages.");
        System.out.println("Press 4 to show About.");
        System.out.println("Press 0 to Exit.");
        int userInputNumber = userInput.getNumber(0, 4); //TODO придумать валидатор для каждого из вариантов, чтобы можно было задать условия для приёма конкретных вещей

            switch (userInputNumber) {
                case 1:
                    showClientsSection();
                    break;
                case 2:
                    showPetsSection();
                    break;
                case 3:
                    showInbox();
                    break;
                case 4:
                    showAbout();
                    break;
                case 0:
                    break;
            }

    }

    private void showAbout() {
        System.out.println("This is VetCRM(tm) v0.1, pre-aplha. All Rights Reserved. Ask your questions on sakhar.medovich@gmail.com");
    }

    private void showInbox() {
        System.out.println("Showing inbox");
    }

    private void showPetsSection() {

    }

    private void showClientsSection() {

    }

}
