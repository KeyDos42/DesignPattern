package composite.visitor;

import composite.*;

public class VisiteurExprPrefixe extends Visiteur {
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
        System.out.println(operateur.getSymbole() + "(");
        for (int i = 0; i < operateur.size()-1; i++) {
            Expression exp = operateur.get(i);
            exp.accept(this);
            System.out.println(",");
        }
        // On visite le dernier

    }

    @Override
    public void visit() {
        Algebrique.getInstance().getExpression().accept(this);
    }
}
