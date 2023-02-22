package composite.operator;

import composite.Expression;
import composite.Number;
import composite.Operator;

import java.util.Iterator;

public class Addition extends Operator {
    public Addition() {
        super('+');
    }

    public int interpret() {
        int res = 0;
        if (this.arguments.size() == 2){
            Iterator<Expression> numberIterator = arguments.iterator();

            while (numberIterator.hasNext()) {
                res += numberIterator.next().interpret();
            }
        } else {
            throw new IllegalArgumentException("Not arguments size !");
        }

        return res;
    }
}
