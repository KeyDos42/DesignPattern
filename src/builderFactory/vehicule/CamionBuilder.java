package builderFactory.vehicule;

import builderFactory.model.Moteur;
import builderFactory.model.TypeJouet;

public class CamionBuilder extends VehiculeBuilder {
    public CamionBuilder(String nom, TypeJouet typeJouet) {
        super.vehicule = new Camion(nom, typeJouet);
    }

    @Override
    void poserRoues() {
        super.vehicule.setNbRoues(8);
    }

    @Override
    void poserMoteur() {
        super.vehicule.setMoteur(Moteur.ESSENCE);
    }
}
