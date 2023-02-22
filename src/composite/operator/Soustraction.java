package composite.operator;

import composite.Operator;

public class Soustraction extends Operator {
    private int x;
    private int y;

    public Soustraction(int x, int y) {
        super.add(Soustraction.this);
        this.x = x;
        this.y = y;
    }

    public double compute() {
        return x - y;
    }
}
