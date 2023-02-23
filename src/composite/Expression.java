package composite;

import composite.visitor.IVisiteur;

public abstract class Expression {
    abstract public int interpret(Contexte c);
    abstract public void accept(IVisiteur iVisiteur);
}
