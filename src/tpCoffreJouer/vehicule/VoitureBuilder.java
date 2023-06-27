package tpCoffreJouer.vehicule;

import tpCoffreJouer.model.Moteur;
import tpCoffreJouer.model.TypeJouet;

public class VoitureBuilder extends VehiculeBuilder {
    TypeJouet type;
    public VoitureBuilder(TypeJouet typeJouet) {
        switch (typeJouet) {
            case VOITURE_BATMAN -> vehicule = new Voiture("Batmobile", TypeJouet.VOITURE_BATMAN);
            case VOITURE_SPIDERMAN -> vehicule = new Voiture(TypeJouet.VOITURE_SPIDERMAN);
        }
        this.type = typeJouet;
    }

    @Override
    public void poserRoues() {
        super.vehicule.setNbRoues(4);
    }

    public void poserMoteur() {
        switch (type) {
            case VOITURE_BATMAN -> super.vehicule.setMoteur(Moteur.DIESEL);
            case VOITURE_SPIDERMAN, CAMION -> super.vehicule.setMoteur(Moteur.ESSENCE);
            case SCOOTER -> super.vehicule.setMoteur(Moteur.ELECTRIQUE);
            default -> super.vehicule.setMoteur(null);
        }
    }
}
