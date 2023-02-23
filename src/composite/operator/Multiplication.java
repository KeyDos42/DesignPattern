package composite.operator;

import composite.Contexte;
import composite.Expression;
import composite.Operateur;

public class Multiplication extends Operateur {
    public Multiplication() {
        super('*');
    }

    public int interpret(Contexte contexte) {
        int res = 1;
        if (this.arguments.size() >= 2){
            for (Expression argument : arguments) {
                res *= argument.interpret(contexte);
            }
        } else {
            throw new IllegalArgumentException("Not arguments size !");
        }

        return res;
    }
}
