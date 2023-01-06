package composite;

public class Addition extends Operator {
    private int x;
    private int y;

    public Addition(int x, int y) {
        super.add(Addition.this);
        this.x = x;
        this.y = y;
    }

    public double compute() {
        return x + y;
    }
}
