package composite.visitor;

public class VisiteurExprPrefixe extends Visiteur {
    @Override
    public void accept(ElementVisiteur elementVisiteur) {
        elementVisiteur.visit(this);
    }
}
