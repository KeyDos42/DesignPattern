package composite.operator;
import composite.Expression;
import composite.Operateur;

public class Division extends Operateur {
    public Division() {
        super('/');
    }

    public int interpret() {
        int res;
        if (this.arguments.size() == 2){
            res = this.arguments.get(0).interpret();
            arguments.remove(arguments.get(0));
            for (Expression argument : arguments) {
                if (argument.interpret() == 0) {
                    throw new IllegalArgumentException("Division par 0");
                } else {
                    res /= argument.interpret();
                }
            }
        } else {
            throw new IllegalArgumentException("Not arguments size !");
        }

        return res;
    }
}
