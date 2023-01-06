package composite;

import java.util.ArrayList;
import java.util.Iterator;
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
            }
        }
        return res;
    }

    void add(Terme arithmetic) {
        operatorList.add(arithmetic);
    }
}