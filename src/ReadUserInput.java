import java.util.Scanner;

/**
 * Created by lstday
 * 23.10.15.
 */
public interface ReadUserInput {
    Scanner scanner = new Scanner(System.in);

    char getAnswer();

    String getString();

    int getNumber();

    //char getCharOperator();

}
