package composite.visitor;

import composite.Operateur;

public interface ElementVisiteur {
    void visit(Infixe infixe);
    void visit(VisiteurExpr visiteurExpr);
    void visit(VisiteurExprPrefixe visiteurExprPrefixe);
    void visit(Operateur operateur);
}
