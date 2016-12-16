/**
 * Created by association on 16/12/16.
 */
public class Lait extends DecorateurIngredient {
    Boisson boisson;

    public Lait(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Lait";
    }

    @Override
    public double cout() {
        return 0.1 + boisson.cout();
    }
}
