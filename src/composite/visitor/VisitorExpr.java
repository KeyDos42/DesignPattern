package composite.visitor;

import composite.*;
import composite.interpret.Expression;
import composite.Number;
import composite.operator.Operator;

public class VisitorExpr extends Visitor {
    private static VisitorExpr instance = null;

    public static VisitorExpr getInstance() {
        if (instance == null) {
            instance = new VisitorExpr();
        }
        return instance;
    }

    public VisitorExpr() {
        super();
    }

    @Override
    public void visit(Number number) {
        System.out.print(number.getValue());
    }

    @Override
    public void visit(Variable variable) {
        System.out.print(variable.getLetter());
    }

    //TODO Refaire l'operateur VisiteurExpr
    @Override
    public void visit(Operator operator) {
        System.out.print("(");
        for (int i = operator.size()-1; i > 0; i--) {
            Expression exp = operator.get(i);
            exp.accept(this);
            System.out.print(",");
        }

        operator.get(operator.size()-1).accept(this);
        System.out.print(")" + operator.getSymbol());
    }

    @Override
    public void visit() {
        for (Expression expression : Algebraic.getInstance().getExpression()) {
            expression.accept(this);
        }
    }
}
