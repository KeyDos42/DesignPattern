package composite.operator;

import composite.Operator;

public class Division extends Operator {
    private int x;
    private int y;

    public Division(int x, int y) {
        super.add(Division.this);
        this.x = x;
        this.y = y;
    }

    public double compute() {
        double res = 0;
        if (y == 0) {
            System.out.println("Error division par 0");
        } else {
            res = x / y;
        }
        return res;
    }
}
