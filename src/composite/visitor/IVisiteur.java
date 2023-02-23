package composite.visitor;

import composite.Nombre;
import composite.Operateur;
import composite.operator.Addition;
import composite.operator.Division;
import composite.operator.Multiplication;
import composite.operator.Soustraction;

public interface IVisiteur {
    void visit(Nombre nombre);
    void visit(Operateur operateur);
    void visit();
}
