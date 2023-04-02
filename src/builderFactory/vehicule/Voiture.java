package builderFactory.vehicule;

import builderFactory.model.TypeJouet;

public class Voiture extends Vehicule {
    public Voiture(String nom, TypeJouet typeJouet) {
        super(nom, typeJouet);
    }

    public Voiture(TypeJouet typeJouet) {
        super(typeJouet);
    }
}
