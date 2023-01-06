package composite;

public class Addition extends Operateur {
    private int x;
    private int y;

    public Addition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double compute() {
        return x + y;
    }
}
