package composite.interpret;

import composite.Expression;
import composite.visitor.IVisitor;

public class Variable extends Expression {
    Letter letter;

    public Variable(Letter letter) {
        this.letter = letter;
    }

    public Letter getLetter() {
        return letter;
    }

    @Override
    public int interpret(Context context) {
        if (context != null && context.containsKey(this.letter)) {
            return context.get(this.letter);
        } else {
            throw new IllegalArgumentException("variable inconnue dans le contexte !");
        }
    }

    @Override
    public void accept(IVisitor visiteur) {
        visiteur.visitAll(this);
    }

    @Override
    public String toString() {
        return "lettre=" + letter +
                '}';
    }
}
