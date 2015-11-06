package ru.VetClinic.VetCRM.actions.pet;

import junit.framework.Assert;
import org.junit.Test;
import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetAction;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.models.Client;
import ru.VetClinic.VetCRM.models.Pet;
import ru.VetClinic.VetCRM.models.PetType;

import java.util.Arrays;
import java.util.Iterator;

import static org.junit.Assert.*;

/**
 * Created by lstday
 * 06.11.15.
 */
public class HealthSwitcherTest {

    @Test
    public void testExecute() throws Exception {
        HealthSwitcher healthSwitcher = new HealthSwitcher();
        VetClinic vetClinic = new VetClinic("asd");

        final Iterator<String> answer = Arrays.asList("client1", "cat").iterator();

        ReadUserInput userInput = new ReadUserInput() {
            @Override
            public char getAnswer() {
                return 0;
            }

            @Override
            public String getString() {
                return answer.next();
            }

            @Override
            public int getNumber(int firstArgOfRange, int secondArgOfRange) {
                return 0;
            }
        };

        Client client1 = new Client("client1");
        vetClinic.addClient(client1);
        Pet pet1 = new Pet(PetType.CAT, "cat");
        Pet pet2 = new Pet(PetType.DOG, "dog");
        vetClinic.addPet(client1.getId(), pet1);
        vetClinic.addPet(client1.getId(), pet2);

        healthSwitcher.execute(userInput, vetClinic);
        Assert.assertEquals(pet1.isSick(), true);
        Assert.assertEquals(pet2.isSick(), false);
    }
}