package builderFactory.vehicule;

import builderFactory.jouet.Jouet;
import builderFactory.model.Moteur;
import builderFactory.model.TypeJouet;

public abstract class Vehicule extends Jouet {
    private int nbRoues;
    private Moteur moteur;

    public Vehicule(String nom, TypeJouet typeJouet) {
        super(nom, typeJouet);
    }

    public void setNbRoues(int nbRoues) {
        this.nbRoues = nbRoues;
    }

    public void setMoteur(Moteur m) {
        this.moteur = m;
    }

    public int getNbRoues()  {
        return nbRoues;
    }

    public Moteur getMoteur() {
        return moteur;
    }
}
