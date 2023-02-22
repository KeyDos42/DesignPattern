package composite.visitor;

import composite.Operateur;
import composite.operator.Addition;
import composite.operator.Division;
import composite.operator.Multiplication;
import composite.operator.Soustraction;

public interface ElementVisiteur {
    void visit(Addition addition);
    void visit(Multiplication multiplication);
    void visit(Soustraction soustraction);
    void visit(Division division);
    void visit(Operateur operateur);
}
