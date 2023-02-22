package composite;

import composite.operator.Addition;
import composite.operator.Division;
import composite.operator.Multiplication;
import composite.operator.Subtraction;

import java.util.ArrayList;
import java.util.List;

public abstract class Operator extends Term {
    List<Term> operatorList = new ArrayList<>();

    @Override
    double computeOperator() {
        double res = 0;
        for (Term term : operatorList) {
            if (term instanceof Addition) {
                res += ((Addition) term).compute();
            } else if (term instanceof Multiplication) {
                res += ((Multiplication) term).compute();
            } else if (term instanceof Division) {
                res += ((Division) term).compute();
            } else if (term instanceof Subtraction) {
                res += ((Subtraction) term).compute();
            }
        }
        return res;
    }

    protected void add(Term arithmetic) {
        operatorList.add(arithmetic);
    }
}