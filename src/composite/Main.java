package composite;

import composite.visitor.VisitorExpr;
import composite.visitor.VisitorExprPrefix;
import composite.visitor.VisitorInfix;

public class Main {
    public static void main(String[] args) {
        // Initialisation and definition
        Algebraic.getInstance();

        System.out.print("Infix expression : ");
        (VisitorInfix.getInstance()).visit();

        System.out.println();
        System.out.print("Expression : ");
        (VisitorExpr.getInstance()).visit();

        System.out.println();
        System.out.print("Prefix expression : ");
        (VisitorExprPrefix.getInstance()).visit();
    }
}
