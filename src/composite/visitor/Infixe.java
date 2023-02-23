package composite.visitor;

import composite.*;

/* Héritage Visteur */
public class Infixe extends Visiteur {
    private static Infixe instance = null;

    public static Infixe getInstance() {
        if (instance == null) {
            instance = new Infixe();
        }
        return instance;
    }

    public Infixe() {
        super();
    }

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
        //TODO Vérifier qu'il y a au moins deux arguments
        System.out.println("(");

        for (int i=0; i<operateur.size()-1; i++) {
            Expression expression = operateur.get(i);
            expression.accept(this);
            System.out.println(operateur.getSymbole() + "");
        }
        operateur.get(operateur.size()-1).accept(this);
        System.out.println(")");
    }

    @Override
    public void visit() {
        Algebrique.getInstance().getExpression().accept(this);
    }
}
