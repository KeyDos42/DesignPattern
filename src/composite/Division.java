package composite;

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
        if (y != 0) {
            res = x / y;
        }
        return res;
    }
}
