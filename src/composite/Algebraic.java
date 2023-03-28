package composite;

import composite.interpret.Context;
import composite.interpret.Letter;
import composite.operations.Addition;
import composite.operations.Division;
import composite.operations.Multiplication;
import composite.operations.Subtraction;
import composite.operator.Operator;

public class Algebraic {
    private static Algebraic instance = null;
    private final static Object LOCK = new Object();
    private Expression expression;

    public static Algebraic getInstance() {
        synchronized (LOCK) {
            if (instance == null) {
                instance = new Algebraic();
            }
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

        Expression p0 = new Number(context.get(Letter.x));
        Expression p1 = new Number(context.get(Letter.y));
        Expression p2 = new Number(context.get(Letter.z));

        Operator s1 = new Addition();
        Multiplication multiplication = new Multiplication();
        multiplication.add(p0);
        multiplication.add(p1);
        multiplication.add(p2);
        s1.add(multiplication);

        Addition addition = new Addition();
        addition.add(p0);
        addition.add(p1);
        s1.add(addition);

        Subtraction subtraction = new Subtraction();
        subtraction.add(p2);
        subtraction.add(p0);
        s1.add(subtraction);

        Division division = new Division();
        division.add(p0);
        division.add(p1);
        s1.add(division);

        this.expression = s1;
        System.out.println(expression);
    }

    public Expression getExpression() {
        return expression;
    }
}