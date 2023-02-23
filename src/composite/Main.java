package composite;

import composite.visitor.VisiteurExpr;
import composite.visitor.VisiteurExprPrefixe;
import composite.visitor.VisiteurInfixe;

public class Main {
    public static void main(String[] args) {
        Algebrique.getInstance();


        (new VisiteurInfixe()).visit();
        System.out.println();
        (new VisiteurExpr()).visit();
        System.out.println();
        (new VisiteurExprPrefixe()).visit();
    }
}
