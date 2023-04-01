package composite.visitor;

import composite.Expression;

public interface IVisitor {
    void visitAll(Expression expression);
    void visit();
}
