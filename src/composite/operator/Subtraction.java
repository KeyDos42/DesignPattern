package composite.operator;

import composite.Operator;

public class Subtraction extends Operator {
    private int x;
    private int y;

    public Subtraction(int x, int y) {
        super.add(Subtraction.this);
        this.x = x;
        this.y = y;
    }

    public double compute() {
        return x - y;
    }
}
