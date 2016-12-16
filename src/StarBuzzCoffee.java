/**
 * Created by association on 16/12/16.
 */
public class StarBuzzCoffee {
    public static void main(String[] args) {
        Boisson boisson01 = new Expresso();
        System.out.println(boisson01.getDescription() + " €" + boisson01.cout());

        Boisson boisson02 = new Sumatra();
        boisson02 = new Chocolat(boisson02);
        boisson02 = new Chocolat(boisson02);
        boisson02 = new Chantilly(boisson02);
        System.out.println(boisson02.getDescription() + " €" + boisson02.cout());

        Boisson boisson03 = new Colombia();
        boisson03 = new Caramel(boisson03);
        boisson03 = new Chocolat(boisson03);
        boisson03 = new Chantilly(boisson03);
        System.out.println(boisson03.getDescription() + " €" + boisson03.cout());

    }
}
