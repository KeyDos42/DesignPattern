package composite;

import composite.visitor.IVisiteur;

public abstract class Expression {
    abstract public int interpret();
    abstract public void accept(IVisiteur iVisiteur);
}
