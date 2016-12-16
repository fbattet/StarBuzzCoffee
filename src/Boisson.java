/**
 * Created by association on 16/12/16.
 */
public abstract class Boisson {
    String description = "Boisson inconnue";

    public String getDescription() {
        return description;
    }

    public abstract double cout();
}
