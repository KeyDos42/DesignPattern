package composite.visitor;

import composite.Nombre;
import composite.Operateur;
import composite.Variable;

public interface IVisiteur {
    void visit(Nombre nombre);
    void visit(Operateur operateur);
    void visit(Variable variable);
    void visit();
}
