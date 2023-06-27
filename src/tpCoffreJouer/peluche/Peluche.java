package tpCoffreJouer.peluche;

import tpCoffreJouer.jouet.Jouet;
import tpCoffreJouer.model.TypeJouet;

public abstract class Peluche extends Jouet {
    public Peluche(String nom, TypeJouet typeJouet) {
        super(nom, typeJouet);
    }

    public Peluche(TypeJouet typeJouet) {
        super(typeJouet);
    }
}
