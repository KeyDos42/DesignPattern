package composite.visitor;

import composite.*;
import composite.Expression;
import composite.Number;
import composite.interpret.Variable;
import composite.operator.Operator;

public class VisitorInfixExpr implements IVisitor {
    private static VisitorInfixExpr instance = null;
    private final static Object LOCK = new Object();

    public static VisitorInfixExpr getInstance() {
        synchronized (LOCK) {
            if (instance == null) {
                instance = new VisitorInfixExpr();
            }
        }
        return instance;
    }

    public VisitorInfixExpr() {
        super();
    }

    @Override
    public void visitAll(Expression expression) {
        switch (expression.getClass().getSimpleName()) {
            case "Addition", "Subtraction", "Multiplication", "Division" -> {
                System.out.print("(");
                for (int i = 0; i < ((Operator) expression).size() - 1; i++) {
                    Expression expressionOperator = ((Operator) expression).get(i);
                    expressionOperator.accept(this);
                    System.out.print(((Operator) expression).getSymbol());
                }
                ((Operator) expression).get(((Operator) expression).size() - 1).accept(this);
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