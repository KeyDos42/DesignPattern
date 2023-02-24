package composite;

import composite.interpret.Context;
import composite.interpret.Expression;
import composite.interpret.Letter;
import composite.operations.Subtraction;
import composite.operator.Operator;

public class Algebraic {
    private static Algebraic instance = null;
    private Expression expression;

    public static Algebraic getInstance() {
        if (instance == null) {
            instance = new Algebraic();
        }
        return instance;
    }

    private Algebraic() {
        genererExpression();
        //genererExpressionAlea();
    }

    private void genererExpression() {
        Context context = new Context(Letter.x, 8);
        context.put(Letter.y, 9);
        context.put(Letter.z, 2);

        Operator s1 = new Subtraction();
        Expression p0 = new Number(context.get(Letter.x));
        Expression p1 = new Number(context.get(Letter.y));
        Expression p2 = new Number(context.get(Letter.z));
        s1.add(p0);
        s1.add(p1);
        s1.add(p2);


        this.expression =s1;
        System.out.println(expression);
        /*
        Operateur p2 = new Soustraction();
        p2.add(i5);
        p2.add(i6);
        System.out.println(p2.interpret(contexte));

        Operateur d2 = new Division();
        d2.add(i5);
        d2.add(i6);
        */
    }

    public Expression getExpression() {
        return expression;
    }
}
