package composite.visitor;

import composite.Expression;

public abstract class Visiteur extends Expression {
    @Override
    public int interpret() {
        return 0;
    }

    @Override
    public abstract void accept(ElementVisiteur elementVisiteur);
}
