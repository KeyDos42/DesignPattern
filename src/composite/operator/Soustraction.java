package composite.operator;

import composite.Expression;
import composite.Operateur;

public class Soustraction extends Operateur {
    public Soustraction() {
        super('-');
    }

    public int interpret() {
        int res;
        if (this.arguments.size() == 2){
            res = this.arguments.get(0).interpret();
            arguments.remove(arguments.get(0));
            for (Expression argument : arguments) {
                res -= argument.interpret();
            }
        } else {
            throw new IllegalArgumentException("Not arguments size !");
        }

        return res;
    }
}
