package composite;

import composite.visitor.ElementVisiteur;

public class Nombre extends Expression {
    private int valeur;

    public Nombre(int valeur) {
        this.valeur = valeur;
    }

    public int interpret() {
        return valeur;
    }

    @Override
    public void accept(ElementVisiteur elementVisiteur) {

    }

    @Override
    public String toString() {
        return "Entier [" +
                "valeur=" + valeur +
                "]";
    }
}
