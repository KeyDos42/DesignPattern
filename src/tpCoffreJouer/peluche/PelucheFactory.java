package tpCoffreJouer.peluche;

import tpCoffreJouer.jouet.IJouet;
import tpCoffreJouer.jouet.JouetFactory;
import tpCoffreJouer.model.TypeJouet;

public class PelucheFactory extends JouetFactory {
    private static PelucheFactory instance;

    public static  PelucheFactory getInstance() {
        if (instance == null) {
            instance = new PelucheFactory();
        }
        return instance;
    }

    @Override
    public IJouet creerJouet(TypeJouet typeJouet) {
        return switch (typeJouet) {
            case PELUCHE_OUIOUI -> new PeluchePersonnage("Oui Oui", typeJouet);
            case PELUCHE_OBELIX -> new PeluchePersonnage(typeJouet);
            case PELUCHE_CHAT -> new PelucheAnimal("Chat", typeJouet);
            case PELUCHE_CHIEN -> new PelucheAnimal("Chien", typeJouet);
            case PELUCHE_LION -> new PelucheAnimal(typeJouet);
            default -> throw new IllegalArgumentException("Type de jouet inconnu");
        };
    }
}
