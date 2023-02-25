package composite.operator;

import composite.Expression;

public interface IOperator {
    boolean add(Expression e);
    Expression remove(int i);
    int size();
    Expression get(int i);
}