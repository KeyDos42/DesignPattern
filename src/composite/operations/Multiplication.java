package composite.operations;

import composite.interpret.Context;
import composite.interpret.Expression;
import composite.operator.Operator;

public class Multiplication extends Operator {
    public Multiplication() {
        super('*');
    }

    public int interpret(Context context) {
        int res = 1;
        if (this.arguments.size() >= 2){
            for (Expression argument : arguments) {
                res *= argument.interpret(context);
            }
        } else {
            throw new IllegalArgumentException("Not arguments size !");
        }

        return res;
    }
}
