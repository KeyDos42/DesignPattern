package composite;

import composite.operator.Addition;
import composite.operator.Division;
import composite.operator.Multiplication;
import composite.operator.Soustraction;

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
    }

    private void genererExpression() {
        Expression i1 = new Number(1);
        Expression i6 = new Number(5);
        Operator p0 = new Addition();
        p0.add(i1);
        p0.add(i6);
        System.out.println(p0.interpret());

        Expression i5 = new Number(5);
        Operator p1 = new Multiplication();
        p1.add(i5);
        p1.add(i6);
        System.out.println(p1.interpret());

        Operator p2 = new Soustraction();
        p2.add(i5);
        p2.add(i6);
        System.out.println(p2.interpret());

        Operator d2 = new Division();
        d2.add(i5);
        d2.add(i6);
        System.out.println(d2.interpret());
    }
}
