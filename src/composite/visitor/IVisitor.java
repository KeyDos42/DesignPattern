package composite.visitor;

import composite.Number;
import composite.operator.Operator;
import composite.interpret.Variable;

public interface IVisitor {
    void visit(Number number);
    void visit(Operator operator);
    void visit(Variable variable);
    void visit();
}
