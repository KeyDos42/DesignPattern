package composite.visitor;

import composite.Algebrique;
import composite.Nombre;
import composite.Operateur;
import composite.Variable;

public class Infixe implements IVisiteur {
    @Override
    public void visit(Nombre nombre) {
        System.out.println(nombre.interpret());
    }

    @Override
    public void visit(Operateur operateur) {
        switch (operateur.getSymbole()) {
            case '+' :
                System.out.println("Opérateur +");
                break;
            case '-' :
                System.out.println("Opérateur -");
                break;
            case '/' :
                System.out.println("Opérateur /");
                break;
            case '*' :
                System.out.println("Opérateur *");
                break;
            default:
                System.out.println(" ");
                break;
        }
    }

    @Override
    public void visit(Variable variable) {
        variable.interpret();
    }

    @Override
    public void visit() {
        Algebrique.getInstance().getExpression().accept(this);
    }
}
