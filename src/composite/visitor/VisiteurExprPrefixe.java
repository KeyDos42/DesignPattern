package composite.visitor;

import composite.*;

public class VisiteurExprPrefixe extends Visiteur {
    @Override
    public void visit(Nombre nombre) {
        System.out.print(nombre.getValeur());
    }

    @Override
    public void visit(Variable variable) {
        System.out.print(variable.getLettre());
    }

    @Override
    public void visit(Operateur operateur) {
        System.out.print(operateur.getSymbole() + "(");
        for (int i = 0; i < operateur.size()-1; i++) {
            Expression exp = operateur.get(i);
            exp.accept(this);
            System.out.print(",");
        }

        operateur.get(operateur.size()-1).accept(this);
        System.out.print(")");
    }

    @Override
    public void visit() {
        Algebrique.getInstance().getExpression().accept(this);
    }
}
