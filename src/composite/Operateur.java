package composite;

import composite.visitor.IVisiteur;

import java.util.ArrayList;
import java.util.List;

public abstract class Operateur extends Expression implements IOperateur {
    protected List<Expression> arguments = new ArrayList<>();
    private final char symbole;

    public Operateur(char symbole) {
        super();
        this.symbole=symbole;
    }

    public char getSymbole() {
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
    public void accept(IVisiteur visiteur) {
        visiteur.visit(this);
    }

    @Override
    public String toString() {
        return "Operateur "+symbole+" [" + arguments + "]";
    }
}