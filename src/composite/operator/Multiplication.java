package composite.operator;

import composite.Expression;
import composite.Operateur;

public class Multiplication extends Operateur {
    public Multiplication() {
        super('*');
    }

    public int interpret() {
        int res = 1;
        if (this.arguments.size() == 2){
            for (Expression argument : arguments) {
                res *= argument.interpret();
            }
        } else {
            throw new IllegalArgumentException("Not arguments size !");
        }

        return res;
    }
}
