package composite.operations;
import composite.interpret.Context;
import composite.interpret.Expression;
import composite.operator.Operator;

public class Division extends Operator {
    public Division() {
        super('/');
    }

    public int interpret(Context context) {
        int res;
        if (this.arguments.size() == 2){
            res = this.arguments.get(0).interpret(context);
            arguments.remove(arguments.get(0));
            for (Expression argument : arguments) {
                if (argument.interpret(context) == 0) {
                    throw new IllegalArgumentException("Division par 0");
                } else {
                    res /= argument.interpret(context);
                }
            }
        } else {
            throw new IllegalArgumentException("Not arguments size !");
        }

        return res;
    }
}
