package tpCoffreJouer.peluche;

import tpCoffreJouer.model.TypeJouet;

public class PeluchePersonnage extends Peluche {
    public PeluchePersonnage(String nom, TypeJouet typeJouet) {
        super(nom, typeJouet);
    }

    public PeluchePersonnage(TypeJouet typeJouet) {
        super(typeJouet);
    }
}