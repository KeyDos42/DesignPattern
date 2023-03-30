package composite.operator;

import composite.Expression;
import composite.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public abstract class Operator extends Expression implements IOperator {
    protected List<Expression> arguments = new ArrayList<>();
    private final char symbol;

    public Operator(char symbol) {
        super();
        this.symbol = symbol;
    }

    public char getSymbol() {
        return this.symbol;
    }

    @Override
    public boolean add(Expression e) {
        return this.arguments.add(e);
    }

    @Override
    public Expression remove(int i) {
        return this.arguments.remove(i);
    }

    @Override
    public int size() {
        return this.arguments.size();
    }

    @Override
    public Expression get(int i) {
        return this.arguments.get(i);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitAll(this);
    }

    @Override
    public String toString() {
        return "Operator "+ symbol +" [" + arguments + "]";
    }
}