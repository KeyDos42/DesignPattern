package composite.visitor;

import composite.*;
import composite.interpret.Expression;
import composite.Number;
import composite.operator.Operator;

import java.util.Iterator;

public class VisitorInfix extends Visitor {
    private static VisitorInfix instance = null;

    public static VisitorInfix getInstance() {
        if (instance == null) {
            instance = new VisitorInfix();
        }
        return instance;
    }

    public VisitorInfix() {
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
        for (Expression expression : Algebraic.getInstance().getExpression()) {
            expression.accept(this);
        }
    }
}
