package composite.operations;

import composite.interpret.Context;
import composite.Expression;
import composite.operator.Operator;

import java.util.Iterator;

public class Addition extends Operator {
    public Addition() {
        super('+');
    }

    public int interpret(Context context) {
        int res = 0;
        if (this.arguments.size() >= 2){
            Iterator<Expression> numberIterator = arguments.iterator();
            while (numberIterator.hasNext()) {
                res += numberIterator.next().interpret(context);
            }
        } else {
            throw new IllegalArgumentException("Not arguments size !");
        }

        return res;
    }
}
