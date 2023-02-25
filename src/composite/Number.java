package composite;

import composite.interpret.Context;
import composite.visitor.IVisitor;

public class Number extends Expression {
    private int valeur;

    public Number(int valeur) {
        super();
        this.valeur = valeur;
    }

    public int interpret(Context context) {
        return this.valeur;
    }

    public int getValue() {
        return valeur;
    }

    @Override
    public void accept(IVisitor visiteur) {
        visiteur.visit(this);
    }

    @Override
    public String toString() {
        return "Entier [" +
                "valeur=" + valeur +
                "]";
    }
}
