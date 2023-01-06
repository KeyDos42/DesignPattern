package composite;

public class Multiplication extends Operateur {
    private int x;
    private int y;

    public Multiplication(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double compute() {
        return x * y;
    }
}
