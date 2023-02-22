package composite.visitor;

public class VisiteurExpr extends Visiteur {

    @Override
    public void accept(ElementVisiteur elementVisiteur) {
        elementVisiteur.visit(this);
    }
}
