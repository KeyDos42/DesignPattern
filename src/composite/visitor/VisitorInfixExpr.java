package composite.visitor;

import composite.*;
import composite.Expression;
import composite.Number;
import composite.interpret.Variable;
import composite.operator.Operator;

public class VisitorInfixExpr implements IVisitor {
    private static VisitorInfixExpr instance = null;

    public static VisitorInfixExpr getInstance() {
        if (instance == null) {
            instance = new VisitorInfixExpr();
        }
        return instance;
    }

    public VisitorInfixExpr() {
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

    @Override
    public void visit(Operator operator) {
        if (operator.size() > 2) {
            System.out.print("(");

            for (int i = 0; i < operator.size() - 1; i++) {
                Expression expression = operator.get(i);
                expression.accept(this);
                System.out.print(operator.getSymbol() + "");
            }
            operator.get(operator.size() - 1).accept(this);
            System.out.print(")");
        } else {
            throw new IllegalArgumentException("Plus de deux arguments !");
        }
    }

    @Override
    public void visit() {
        Algebraic.getInstance().getExpression().accept(this);
    }
}
