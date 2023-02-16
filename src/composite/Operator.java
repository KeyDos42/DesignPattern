package composite;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Operator extends Terme {
    List<Terme> operatorList = new ArrayList<>();

    @Override
    double computeOperator() {
        Iterator<Terme> termeIterator = operatorList.iterator();
        double res = 0;

        while (termeIterator.hasNext()) {
            if (termeIterator instanceof Addition) {
                res += ((Addition) termeIterator).compute();
            } else if (termeIterator instanceof Multiplication) {
                res += ((Multiplication) termeIterator).compute();
            }

            termeIterator.next();
        }

        return res;
    }

    void add(Terme arithmetic) {
        operatorList.add(arithmetic);
    }
}