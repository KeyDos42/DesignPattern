package composite.interpret;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<Letter, Integer> map = new HashMap<>();

    public Context(Letter x, int i) {
        super();
        this.put(x, i);
    }

    public void put(Letter letter, int i) {
        map.put(letter, i);
    }

    public boolean containsKey(Letter letter) {
        return map.containsKey(letter);
    }

    public int get(Letter letter) {
        Integer value = map.get(letter);
        if (value == null) {
            throw new NullPointerException("Get value null !");
        }
        return value;
    }
}