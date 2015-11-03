package ru.VetClinic.VetCRM.actions.inClient;

import org.junit.Assert;
import org.junit.Test;
import ru.VetClinic.VetCRM.VetClinic;
import ru.VetClinic.VetCRM.models.Client;

/**
 * Created by lstday
 * 03.11.15.
 */
public class AddClientTest {
    @Test
    public void testExecute() throws Exception {

        VetClinic vetClinic = new VetClinic("asd");

        Client client1 = new Client("clientName1");
        Client client2 = new Client("clientName2");
        Client client3 = new Client("clientName3");
        vetClinic.addClient(client1);
        vetClinic.addClient(client2);

        Assert.assertTrue(vetClinic.getClientList().contains(client1));
        Assert.assertTrue(vetClinic.getClientList().contains(client2));
        Assert.assertFalse(vetClinic.getClientList().contains(client3));
    }

}