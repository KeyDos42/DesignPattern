package composite;

import composite.interpret.Context;
import composite.visitor.IVisitor;

public abstract class Expression {
    abstract public int interpret(Context c);

    abstract public void accept(IVisitor iVisitor);
}