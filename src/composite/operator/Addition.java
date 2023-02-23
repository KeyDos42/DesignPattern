package composite.operator;

import composite.Contexte;
import composite.Expression;
import composite.Operateur;

import java.util.Iterator;

public class Addition extends Operateur {
    public Addition() {
        super('+');
    }

    public int interpret(Contexte contexte) {
        int res = 0;
        if (this.arguments.size() >= 2){
            Iterator<Expression> numberIterator = arguments.iterator();
            while (numberIterator.hasNext()) {
                res += numberIterator.next().interpret(contexte);
            }
        } else {
            throw new IllegalArgumentException("Not arguments size !");
        }

        return res;
    }
}
