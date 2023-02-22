package composite;

import composite.visitor.ElementVisiteur;
import composite.visitor.Visiteur;

public abstract class Expression {
    abstract public int interpret();
    abstract public void accept(ElementVisiteur elementVisiteur);
}
