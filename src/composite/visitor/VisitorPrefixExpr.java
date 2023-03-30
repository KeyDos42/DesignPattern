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
        switch (expression.getClass().getSimpleName()) {
            case "Addition", "Subtraction", "Multiplication", "Division" -> {
                System.out.print(((Operator) expression).getSymbol() + "(");
                Utils.getVisitorExpression(this, (Operator) expression);
                System.out.print(")");
            }
            case "Number" -> System.out.print(((Number) expression).getValue());
            case "Variable" -> System.out.print(((Variable) expression).getLetter());
            default -> {
            }
        }
    }

    @Override
    public void visit() {
        Algebraic.getInstance().getExpression().accept(this);
    }
}
