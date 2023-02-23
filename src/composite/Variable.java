package composite;

import composite.visitor.IVisiteur;

public class Variable extends Expression {
    Lettre lettre;

    public Variable(Lettre lettre) {
        this.lettre = lettre;
    }

    public Lettre getLettre() {
        return lettre;
    }

    @Override
    public int interpret(Contexte contexte) {
        if (contexte != null && contexte.containsKey(this.lettre)) {
            return contexte.get(this.lettre);
        } else {
            throw new IllegalArgumentException("variable inconnue dans le contexte !");
        }
    }

    @Override
    public void accept(IVisiteur visiteur) {
        visiteur.visit(this);
    }

    @Override
    public String toString() {
        return "lettre=" + lettre +
                '}';
    }
}
