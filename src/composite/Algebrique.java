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
        //genererExpressionAlea();
    }

    private void genererExpression() {
        Contexte contexte = new Contexte(Lettre.x, 8);
        contexte.put(Lettre.y, 9);
        contexte.put(Lettre.z, 2);

        Operateur s1 = new Soustraction();
        Expression p0 = new Nombre(contexte.get(Lettre.x));
        Expression p1 = new Nombre(contexte.get(Lettre.y));
        Expression p2 = new Nombre(contexte.get(Lettre.z));
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
