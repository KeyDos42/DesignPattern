package composite;

import composite.visitor.IVisiteur;

public class Nombre extends Expression {
    private int valeur;

    public Nombre(int valeur) {
        this.valeur = valeur;
    }

    public int interpret() {
        return valeur;
    }

    @Override
    public void accept(IVisiteur visiteur) {
        visiteur.visit(this);
    }

    @Override
    public String toString() {
        return "Entier [" +
                "valeur=" + valeur +
                "]";
    }
}
