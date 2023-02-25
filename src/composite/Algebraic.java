package composite;

import composite.interpret.Context;
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
        generate1();
    }

    private void generate1() {
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

        this.expression = s1;
        System.out.println(expression);

        /*
        Operator s3 = new Subtraction();
        s3.add(p0);
        s3.add(p1);

        this.expression = s3;
        System.out.println(expression);


        Operator s4 = new Division();
        s4.add(p1);
        s4.add(p2);

        this.expression = s4;
        System.out.println(expression);
         */
    }

    public Expression getExpression() {
        return expression;
    }
}