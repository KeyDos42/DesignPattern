package tpCoffreJouer.jouet;


import tpCoffreJouer.model.TypeJouet;
import tpCoffreJouer.peluche.PelucheFactory;
import tpCoffreJouer.vehicule.VehiculeFactory;

public abstract class JouetFactory {
    public abstract IJouet creerJouet(TypeJouet typeJouet);

    public static JouetFactory getFactory(TypeJouet typeJouet) {
        return switch (typeJouet) {
            case PELUCHE_OUIOUI, PELUCHE_CHAT, PELUCHE_CHIEN, PELUCHE_LION, PELUCHE_OBELIX -> PelucheFactory.getInstance();
            case VOITURE_SPIDERMAN, VOITURE_BATMAN, SCOOTER, CAMION -> VehiculeFactory.getInstance();
        };
    }
}