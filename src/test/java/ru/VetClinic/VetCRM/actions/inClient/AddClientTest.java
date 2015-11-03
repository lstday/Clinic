package ru.VetClinic.VetCRM.actions.inClient;

import org.junit.Assert;
import org.junit.Test;
import ru.VetClinic.VetCRM.ReadUserInput;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.actions.client.AddClient;

import static org.hamcrest.core.Is.is;

/**
 * Created by lstday
 * 03.11.15.
 */
public class AddClientTest {

    @Test
    public void testExecute() throws Exception {
        AddClient addClient = new AddClient();
        VetClinic vetClinic = new VetClinic("asd");
        ReadUserInput readUserInput = new ReadUserInput() {
            @Override
            public char getAnswer() {
                return 0;
            }

            @Override
            public String getString() {
                return "start user";
            }

            @Override
            public int getNumber(int firstArgOfRange, int secondArgOfRange) {
                return 0;
            }
        };
        addClient.execute(readUserInput, vetClinic);
//        Assert.assertThat(vetClinic.getClientList().iterator().next().getName(), is(readUserInput.getString()));
        Assert.assertEquals(vetClinic.getClientList().iterator().next().getName(), readUserInput.getString());
    }
}
//
//
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