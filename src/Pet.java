import java.util.UUID;

/**
 * Created by lstday
 * 22.10.15.
 */
public class Pet extends Animal {
    final String name;
    final String id;
    String breed;
    PetType type;

    public Pet(String name, PetType type) {
        this.name = name;
        this.type = type;
        id = String.valueOf(UUID.randomUUID());
    }
}
