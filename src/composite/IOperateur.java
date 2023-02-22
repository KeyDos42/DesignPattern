package composite;

public interface IOperateur {
    public boolean add(Expression e);
    public Expression remove(int i);
    public int size();
    public Expression get(int i);
}
