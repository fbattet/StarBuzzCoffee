/**
 * Created by association on 16/12/16.
 */
public class Chocolat extends DecorateurIngredient {
    Boisson boisson;

    public Chocolat(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Chocolat";
    }

    @Override
    public double cout() {
        return .20 + boisson.cout();
    }
}
