package composite;

import composite.visitor.VisitorPostfixExpr;
import composite.visitor.VisitorPrefixExpr;
import composite.visitor.VisitorInfixExpr;

public class Main {
    public static void main(String[] args) {
        Algebraic.getInstance();

        System.out.print("Infix expression : ");
        (VisitorInfixExpr.getInstance()).visit();

        System.out.println();
        System.out.print("Postfix expression : ");
        (VisitorPostfixExpr.getInstance()).visit();

        System.out.println();
        System.out.print("Prefix expression : ");
        (VisitorPrefixExpr.getInstance()).visit();
    }
}
