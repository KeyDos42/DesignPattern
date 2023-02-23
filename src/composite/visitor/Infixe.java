package composite.visitor;

import composite.Algebrique;
import composite.Nombre;
import composite.Operateur;

public class Infixe implements IVisiteur {
    @Override
    public void visit(Nombre nombre) {
        System.out.println(nombre.interpret());
    }

    @Override
    public void visit(Operateur operateur) {
        System.out.println(operateur.getSymbole() + operateur.toString());
    }

    @Override
    public void visit() {
        Algebrique.getInstance().getExpression().accept(this);
    }
}
