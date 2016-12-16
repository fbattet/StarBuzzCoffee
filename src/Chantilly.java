/**
 * Created by association on 16/12/16.
 */
public class Chantilly extends DecorateurIngredient {
    Boisson boisson;

    public Chantilly(Boisson boisson) {
        this.boisson = boisson;
    }


    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Chantilly";
    }

    @Override
    public double cout() {
        return .1 + boisson.cout();
    }
}
