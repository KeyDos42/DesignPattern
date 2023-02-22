package composite.operator;

import composite.Operator;

public class Multiplication extends Operator {
    private int x;
    private int y;

    public Multiplication(int x, int y) {
        super.add(Multiplication.this);
        this.x = x;
        this.y = y;
    }

    public double compute() {
        return x * y;
    }
}
