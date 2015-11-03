package ru.VetClinic.VetCRM.actions.inClient;

import junit.framework.Assert;
import org.junit.Test;
import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.actions.client.RemoveClient;
import ru.VetClinic.VetCRM.models.Client;

import java.util.Arrays;

/**
 * Created by lstday
 * 03.11.15.
 */
public class RemoveClientTest {

    @Test
    public void testExecute() throws Exception {
        RemoveClient removeClient = new RemoveClient();
        VetClinic vetClinic = new VetClinic("asd");
        Client client1 = new Client("aaaa");
        Client client2 = new Client("ssss");
        vetClinic.addClient(client1);
        ReadUserInput userInput = new ReadUserInput() {
            @Override
            public char getAnswer() {
                return 0;
            }

            @Override
            public String getString() {
                return null;
            }

            @Override
            public int getNumber(int firstArgOfRange, int secondArgOfRange) {
                return 1;
            }
        };
        removeClient.execute(userInput, vetClinic);

        Assert.assertFalse(vetClinic.getClientList().contains(client2));
        Assert.assertFalse(vetClinic.getClientList().contains(client1));


    }
}
//        VetClinic vetClinic = new VetClinic("asd");
//
//        Client client1 = new Client("clientName1");
//        Client client2 = new Client("clientName2");
//        Client client3 = new Client("clientName3");
//        vetClinic.addClient(client1);
//        vetClinic.addClient(client2);
//
//        Assert.assertTrue(vetClinic.getClientList().contains(client1));
//        Assert.assertTrue(vetClinic.getClientList().contains(client2));
//        Assert.assertFalse(vetClinic.getClientList().contains(client3));
//
//        vetClinic.removeClient(client1.getId());
//        vetClinic.removeClient(client2.getId());
//
//        Assert.assertTrue(vetClinic.getClientList().contains(client1));
//        Assert.assertTrue(vetClinic.getClientList().contains(client2));