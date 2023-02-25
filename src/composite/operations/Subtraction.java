package composite.operations;

import composite.interpret.Context;
import composite.Expression;
import composite.operator.Operator;

public class Subtraction extends Operator {
    public Subtraction() {
        super('-');
    }

    public int interpret(Context context) {
        int res;
        if (this.arguments.size() >= 2){
            res = this.arguments.get(0).interpret(context);
            arguments.remove(arguments.get(0));
            for (Expression argument : arguments) {
                res -= argument.interpret(context);
            }
        } else {
            throw new IllegalArgumentException("Not arguments size !");
        }

        return res;
    }
}
