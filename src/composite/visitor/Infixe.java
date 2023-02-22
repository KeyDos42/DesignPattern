package composite.visitor;

public class Infixe extends Visiteur {
    @Override
    public void accept(ElementVisiteur elementVisiteur) {
        elementVisiteur.visit(this);
    }
}
