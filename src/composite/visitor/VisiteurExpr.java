package composite.visitor;

import composite.*;

public class VisiteurExpr extends Visiteur {
    @Override
    public void visit(Nombre nombre) {
        System.out.print(nombre.getValeur());
    }

    @Override
    public void visit(Variable variable) {
        System.out.print(variable.getLettre());
    }

    //TODO Refaire l'operateur VisiteurExpr
    @Override
    public void visit(Operateur operateur) {
        System.out.print("(");
        for (int i = operateur.size()-1; i > 0; i--) {
            Expression exp = operateur.get(i);
            exp.accept(this);
            System.out.print(",");
        }

        operateur.get(operateur.size()-1).accept(this);
        System.out.print(")" + operateur.getSymbole());
    }

    @Override
    public void visit() {
        Algebrique.getInstance().getExpression().accept(this);
    }
}
