package builderFactory.peluche;

import builderFactory.jouet.IJouet;
import builderFactory.jouet.JouetFactory;
import builderFactory.model.TypeJouet;

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
            case PELUCHE_OBELIX -> new PeluchePersonnage("Obelix", typeJouet);
            case PELUCHE_CHAT -> new PelucheAnimal("Chat", typeJouet);
            case PELUCHE_CHIEN -> new PelucheAnimal("Chien", typeJouet);
            case PELUCHE_LION -> new PelucheAnimal("Lion", typeJouet);
            default -> throw new IllegalArgumentException("Type de jouet inconnu");
        };
    }
}
