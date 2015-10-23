/**
 * Created by lstday
 * 22.10.15.
 */
public class VetClinicManager {
    public static ReadUserInputImpl userInput = new ReadUserInputImpl();

    public void runVetClinic(String clinicName) {
        VetClinic vetClinic = new VetClinic(clinicName);
        System.out.printf("Hello in our Vet Clinic %s, dear Director!\n Want a little work?", clinicName);
        askWhatUserWant(clinicName);
    }

    private void askWhatUserWant(String clinicName) {
        System.out.println("In our VetCRM(tm) you can perform next actions:");
        System.out.println("Press 1 to move in Clients section.");
        System.out.println("Press 2 to move in Pets section.");
        System.out.println("Press 3 to see inbox messages.");
        System.out.println("Press 4 to show About.");
        System.out.println("Press 0 to Exit.");

    }

}
