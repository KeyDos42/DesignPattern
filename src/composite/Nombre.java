package composite;

import composite.visitor.IVisiteur;

public class Nombre extends Expression {
    private int valeur;

    public Nombre(int valeur) {
        super();
        this.valeur = valeur;
    }

    public int interpret(Contexte contexte) {
        return this.valeur;
    }

    public int getValeur() {
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
