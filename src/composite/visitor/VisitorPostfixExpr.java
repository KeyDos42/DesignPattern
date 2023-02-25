package composite.visitor;

import composite.*;
import composite.Number;
import composite.interpret.Variable;
import composite.operator.Operator;

public class VisitorPostfixExpr implements IVisitor {
    private static VisitorPostfixExpr instance = null;

    public static VisitorPostfixExpr getInstance() {
        if (instance == null) {
            instance = new VisitorPostfixExpr();
        }
        return instance;
    }

    public VisitorPostfixExpr() {
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
        Utils.getVisitorExpression(this, operator);
        System.out.print(")" + operator.getSymbol());
    }

    @Override
    public void visit() {
        Algebraic.getInstance().getExpression().accept(this);
    }
}
