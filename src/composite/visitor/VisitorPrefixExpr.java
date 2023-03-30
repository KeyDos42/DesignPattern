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
    public void visitAll(Expression expression) {
        if (expression instanceof Operator) {
            System.out.print(((Operator) expression).getSymbol() + "(");
            Utils.getVisitorExpression(this, (Operator) expression);
            System.out.print(")");
        } else if (expression instanceof Number) {
            System.out.print(((Number) expression).getValue());
        } else if (expression instanceof Variable) {
            System.out.print(((Variable) expression).getLetter());
        }
    }

    @Override
    public void visit() {
        Algebraic.getInstance().getExpression().accept(this);
    }
}
