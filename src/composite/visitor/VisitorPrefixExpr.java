package composite.visitor;

import composite.*;
import composite.Number;
import composite.interpret.Variable;
import composite.operator.Operator;

public class VisitorPrefixExpr implements IVisitor {
    private static VisitorPrefixExpr instance = null;
    private final static Object LOCK = new Object();

    public static VisitorPrefixExpr getInstance() {
        synchronized (LOCK) {
            if (instance == null) {
                instance = new VisitorPrefixExpr();
            }
        }
        return instance;
    }

    public VisitorPrefixExpr() {
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
        System.out.print(operator.getSymbol() + "(");
        Utils.getVisitorExpression(this, operator);
        System.out.print(")");
    }

    @Override
    public void visit() {
        Algebraic.getInstance().getExpression().accept(this);
    }
}
