import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lstday
 * 22.10.15.
 */
public class VetClinic {
    private String name;

    private static final AtomicInteger clientCount = new AtomicInteger(0);
    private final HashMap<Integer, Client> clientList = new HashMap<>();

    public VetClinic(String name) {

        this.name = name;
    }

    public void addClient(final Client client) {
        clientList.put(clientCount.incrementAndGet(), client);
    }

//    public Client[] findClientsByPetName(final String name) { //TODO сделать
//    }
//
//    public String[] getPetNames(Client client){ //TODO сделать
//    }
//
//    public void removeClient(Client client) { //TODO сделать
//
//    }

}
