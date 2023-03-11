package composite;

import composite.interpret.Context;
import composite.visitor.IVisitor;

public class Number extends Expression {
    private final int value;

    public Number(int value) {
        super();
        this.value = value;
    }

    public int interpret(Context context) {
        return this.value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Integer [" +
                "value=" + value +
                "]";
    }
}
