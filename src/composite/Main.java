package composite;

import composite.visitor.VisiteurInfixe;

public class Main {
    public static void main(String[] args) {
        Algebrique.getInstance();


        (new VisiteurInfixe()).visit();
        // (new VisiteurExpr()).visit();
        // (new VisiteurExprPrefixe()).visit();
    }
}
