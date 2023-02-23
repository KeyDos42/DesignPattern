package composite;

import composite.visitor.IVisiteur;

public class Variable extends Expression {
    Lettre lettre;

    public Variable(Lettre lettre) {
        this.lettre = lettre;
    }

    @Override
    public int interpret(Contexte contexte) {
        return contexte.getValue(lettre);
    }

    @Override
    public void accept(IVisiteur iVisiteur) {
        iVisiteur.visit(this);
    }
}
