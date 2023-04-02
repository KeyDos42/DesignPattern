package builderFactory.peluche;

import builderFactory.model.TypeJouet;

public class PelucheAnimal extends Peluche {
    public PelucheAnimal(String nom, TypeJouet typeJouet) {
        super(nom, typeJouet);
    }

    public PelucheAnimal(TypeJouet typeJouet) {
        super(typeJouet);
    }
}
