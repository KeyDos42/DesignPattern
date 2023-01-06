package composite;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Multiplication(5,8);
        operator.add(new Addition(5,8));
        operator.add(new Multiplication(5, 5));
        System.out.println(operator.computeOperator());
    }
}
