/**
 * Created by lstday
 * 23.10.15.
 */
public class ReadUserInputImpl implements ReadUserInput, AutoCloseable {

    @Override
    public char getAnswer() {
        Character answer = null;
        String tempStringAnswer = "";
        do {
            tempStringAnswer = scanner.next();
            if ((!tempStringAnswer.equalsIgnoreCase("y") && !tempStringAnswer.equalsIgnoreCase("n") && !tempStringAnswer.equalsIgnoreCase("q")))
                System.out.println("You must enter y or n or q! Do it!");
        }
        while (!tempStringAnswer.equalsIgnoreCase("y") && !tempStringAnswer.equalsIgnoreCase("n") && !tempStringAnswer.equalsIgnoreCase("q"));
        if (tempStringAnswer.equalsIgnoreCase("y")) return 'y';
        else if (tempStringAnswer.equalsIgnoreCase("n")) return 'n';
        else return 'q';
    }


    @Override
    public String getString() {
        String userInput;
        do {
            userInput = scanner.next();
            if (userInput.length() < 3) {
                System.out.println("You must enter at least 3 symbols!");
                userInput = null; //TODO придумать метод, который обнуляет объекты.
            }
        }
        while (userInput == null);

        return userInput;
    }

    @Override
    public int getNumber() {
        int number = Integer.MIN_VALUE;
        do {
            char tempChar = scanner.nextLine().charAt(0);
//            char tempChar = '-';
            if ((tempChar - '0' < 0) || (tempChar - '0' > 10))
                System.out.println("You must enter correct value");
            else
                number = tempChar - '0';
        } while (number < 0 || number > 10);
        return number;
    }

    @Override
    public void close() throws Exception {
        scanner.close();
    }
}
