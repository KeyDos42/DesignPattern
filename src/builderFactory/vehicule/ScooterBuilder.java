package builderFactory.vehicule;

import builderFactory.model.Moteur;
import builderFactory.model.TypeJouet;

public class ScooterBuilder extends VehiculeBuilder {
    public ScooterBuilder(String nom, TypeJouet typeJouet) {
        super.vehicule = new Scooter(nom, typeJouet);
    }

    @Override
    void poserRoues() {
        super.vehicule.setNbRoues(2);
    }

    @Override
    void poserMoteur() {
        super.vehicule.setMoteur(Moteur.ESSENCE);
    }
}
