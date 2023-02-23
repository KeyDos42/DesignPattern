package composite.visitor;

import composite.Algebrique;
import composite.Nombre;
import composite.Operateur;
import composite.Variable;

public class VisiteurExpr extends Visiteur {
    @Override
    public void visit(Nombre nombre) {
        System.out.println(nombre.getValeur());
    }

    @Override
    public void visit(Variable variable) {
        System.out.println(variable.getLettre());
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
