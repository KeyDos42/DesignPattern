package composite;

import composite.operator.Addition;
import composite.operator.Division;
import composite.operator.Multiplication;
import composite.operator.Soustraction;

public class Algebrique {
    private static Algebrique instance = null;
    private Expression expression;

    public static Algebrique getInstance() {
        if (instance == null) {
            instance = new Algebrique();
        }
        return instance;
    }

    private Algebrique() {
        genererExpression();
    }

    private void genererExpression() {
        Expression i1 = new Nombre(1);
        Expression i6 = new Nombre(5);
        Operateur p0 = new Addition();
        p0.add(i1);
        p0.add(i6);
        System.out.println(p0.interpret());

        Expression i5 = new Nombre(5);
        Operateur p1 = new Multiplication();
        p1.add(i5);
        p1.add(i6);
        System.out.println(p1.interpret());

        Operateur p2 = new Soustraction();
        p2.add(i5);
        p2.add(i6);
        System.out.println(p2.interpret());

        Operateur d2 = new Division();
        d2.add(i5);
        d2.add(i6);
        System.out.println(d2.interpret());
    }
}
