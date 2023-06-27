package tpCoffreJouer.vehicule;

import tpCoffreJouer.jouet.IJouet;
import tpCoffreJouer.jouet.JouetFactory;
import tpCoffreJouer.model.TypeJouet;

public class VehiculeFactory extends JouetFactory {
    public static VehiculeFactory instance;

    public static VehiculeFactory getInstance() {
        if (instance == null) {
            instance = new VehiculeFactory();
        }
        return instance;
    }

    @Override
    public IJouet creerJouet(TypeJouet typeJouet) {
        VehiculeBuilder vehiculeBuilder;
        IJouet jouet = null;
        switch (typeJouet) {
            case SCOOTER -> vehiculeBuilder = new ScooterBuilder("Scooter", TypeJouet.SCOOTER);
            case VOITURE_BATMAN -> vehiculeBuilder = new VoitureBuilder(TypeJouet.VOITURE_BATMAN);
            case VOITURE_SPIDERMAN -> vehiculeBuilder = new VoitureBuilder(TypeJouet.VOITURE_SPIDERMAN);
            case CAMION -> vehiculeBuilder = new CamionBuilder("Camion", TypeJouet.CAMION);
            default -> vehiculeBuilder = null;
        }

        if (vehiculeBuilder != null) {
            vehiculeBuilder.poserRoues();
            vehiculeBuilder.poserMoteur();
            jouet = vehiculeBuilder.getVehicule();
        }

        return jouet;
    }
}
