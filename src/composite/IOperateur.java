package composite;

public interface IOperateur {
    boolean add(Expression e);
    Expression remove(int i);
    int size();
    Expression get(int i);
}