package composite.visitor;

import composite.*;

/* Héritage Visteur */
public class VisiteurInfixe extends Visiteur {
    private static VisiteurInfixe instance = null;

    public static VisiteurInfixe getInstance() {
        if (instance == null) {
            instance = new VisiteurInfixe();
        }
        return instance;
    }

    public VisiteurInfixe() {
        super();
    }

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
        //TODO Vérifier qu'il y a au moins deux arguments
        if (operateur.size() > 2) {
            System.out.print("(");

            for (int i=0; i<operateur.size()-1; i++) {
                Expression expression = operateur.get(i);
                expression.accept(this);
                System.out.print(operateur.getSymbole() + "");
            }
            operateur.get(operateur.size()-1).accept(this);
            System.out.print(")");
        }
    }

    @Override
    public void visit() {
        Algebrique.getInstance().getExpression().accept(this);
    }
}
