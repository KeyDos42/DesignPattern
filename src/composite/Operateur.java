package composite;

import java.util.ArrayList;
import java.util.List;

public class Operateur extends Terme {
    List<Terme> operatorList = new ArrayList<>();

    @Override
    double compute() {
        double res = 0;
        for (Terme terme : operatorList) {
            res += terme.compute();
        }
        return res;
    }

    void add(Terme arithmetic) {
        operatorList.add(arithmetic);
    }
}