package builderFactory.jouet;

import builderFactory.model.TypeJouet;

public abstract class Jouet implements IJouet {
    private String nom="inconnu";
    private final TypeJouet typeJouet;

    public Jouet(String nom, TypeJouet typeJouet) {
        super();
        this.nom = nom;
        this.typeJouet = typeJouet;
    }

    public String getNom() {
        return nom;
    }

    public TypeJouet getTypeJouet() {
        return typeJouet;
    }

    @Override
    public String toString() {
        return "Jouet{" +
                "nom='" + nom + '\'' +
                ", typeJouet=" + typeJouet +
                '}';
    }
}
