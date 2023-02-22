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
        if (y == 0) {
            throw new IllegalArgumentException("Divide by zero error");
        } else {
            return x / y;
        }
    }
}
