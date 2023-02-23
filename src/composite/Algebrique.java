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
        generExp();
    }

    private void genererExpression() {
        Contexte contexte = new Contexte();

        Expression i1 = new Nombre(contexte.getValue(Lettre.x));
        Expression i6 = new Nombre(contexte.getValue(Lettre.y));
        Operateur p0 = new Addition();
        p0.add(i1);
        p0.add(i6);
        System.out.println(p0.interpret(contexte));

        Expression i5 = new Nombre(contexte.getValue(Lettre.z));
        Operateur p1 = new Multiplication();
        p1.add(i5);
        p1.add(i6);
        System.out.println(p1.interpret(contexte));

        Operateur p2 = new Soustraction();
        p2.add(i5);
        p2.add(i6);
        System.out.println(p2.interpret(contexte));

        Operateur d2 = new Division();
        d2.add(i5);
        d2.add(i6);
    }

    private void generExp() {

    }

    public Expression getExpression() {
        return expression;
    }
}
