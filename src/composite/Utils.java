package composite;

import composite.operator.Operator;
import composite.visitor.IVisitor;

public class Utils {
    public static void getVisitorExpression(IVisitor iVisitor, Operator operator) {
        for (int i = 0; i < operator.size()-1; i++) {
            Expression exp = operator.get(i);
            exp.accept(iVisitor);
            System.out.print(",");
        }

        operator.get(operator.size()-1).accept(iVisitor);
    }
}
