/**
 * Created by association on 16/12/16.
 */
public class Caramel extends DecorateurIngredient {
    Boisson boisson;

    public Caramel(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Caramel";
    }

    @Override
    public double cout() {
        return 0.15 + boisson.cout();
    }
}
