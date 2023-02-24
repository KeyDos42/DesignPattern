package composite.operator;

import composite.interpret.Expression;
import composite.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public abstract class Operator extends Expression implements IOperator {
    protected List<Expression> arguments = new ArrayList<>();
    private final char symbole;

    public Operator(char symbole) {
        super();
        this.symbole=symbole;
    }

    public char getSymbol() {
        return this.symbole;
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
    public void accept(IVisitor visiteur) {
        visiteur.visit(this);
    }

    @Override
    public String toString() {
        return "Operateur "+symbole+" [" + arguments + "]";
    }
}