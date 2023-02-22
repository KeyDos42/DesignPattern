package composite;

import composite.operator.Addition;
import composite.operator.Division;
import composite.operator.Multiplication;
import composite.operator.Soustraction;

import java.util.ArrayList;
import java.util.List;

public abstract class Operator extends Terme {
    List<Terme> operatorList = new ArrayList<>();

    @Override
    double computeOperator() {
        double res = 0;
        for (Terme terme : operatorList) {
            if (terme instanceof Addition) {
                res += ((Addition) terme).compute();
            } else if (terme instanceof Multiplication) {
                res += ((Multiplication) terme).compute();
            } else if (terme instanceof Division) {
                res += ((Division) terme).compute();
            } else if (terme instanceof Soustraction) {
                res += ((Soustraction) terme).compute();
            }
        }
        return res;
    }

    protected void add(Terme arithmetic) {
        operatorList.add(arithmetic);
    }
}