package composite;

import composite.operator.Addition;
import composite.operator.Division;
import composite.operator.Multiplication;
import composite.operator.Soustraction;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Multiplication(5,8);
        operator.add(new Addition(5,8));
        operator.add(new Multiplication(5, 5));
        operator.add(new Soustraction(6, 5));
        operator.add(new Division(4, 2));
        System.out.println(operator.computeOperator());
    }
}
