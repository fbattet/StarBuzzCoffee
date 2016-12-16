/**
 * Created by association on 16/12/16.
 */
public class Expresso extends Boisson {
    public Expresso() {
        description = "Espresso";
    }

    @Override
    public double cout() {
        return 1.99;
    }
}
