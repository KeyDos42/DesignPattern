package composite.visitor;

import composite.*;
import composite.interpret.Expression;
import composite.Number;
import composite.operator.Operator;

public class VisitorExprPrefix extends Visitor {
    private static VisitorExprPrefix instance = null;

    public static VisitorExprPrefix getInstance() {
        if (instance == null) {
            instance = new VisitorExprPrefix();
        }
        return instance;
    }

    public VisitorExprPrefix() {
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
        for (int i = 0; i < operator.size()-1; i++) {
            Expression exp = operator.get(i);
            exp.accept(this);
            System.out.print(",");
        }

        operator.get(operator.size()-1).accept(this);
        System.out.print(")");
    }

    @Override
    public void visit() {
        Algebraic.getInstance().getExpression().accept(this);
    }
}
