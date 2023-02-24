package composite;

import composite.interpret.Context;
import composite.interpret.Expression;
import composite.interpret.Letter;
import composite.operations.Multiplication;
import composite.operations.Subtraction;
import composite.operator.Operator;

import java.util.ArrayList;
import java.util.List;

public class Algebraic {
    private static Algebraic instance = null;
    private final List<Expression> expression;

    public static Algebraic getInstance() {
        if (instance == null) {
            instance = new Algebraic();
        }
        return instance;
    }

    private Algebraic() {
        expression = new ArrayList<>();

        generate1();
        generate2();
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

        this.expression.add(s1);
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

    private void generate2() {
        Context context = new Context(Letter.x, 4);
        context.put(Letter.y, 3);
        context.put(Letter.z, 1);

        Operator s2 = new Multiplication();

        s2.add(new Number(context.get(Letter.x)));
        s2.add(new Number(context.get(Letter.y)));
        s2.add(new Number(context.get(Letter.z)));

        this.expression.add(s2);
        System.out.println(expression);
    }

    public List<Expression> getExpression() {
        return expression;
    }
}