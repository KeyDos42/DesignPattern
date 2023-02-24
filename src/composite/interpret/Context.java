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

    public int getValue(Letter letter) {
        Integer value = map.get(letter);
        if (value == null) {
            throw new NullPointerException();
        }
        return value;
    }

    public int get(Letter letter) {
        // System.out.println("HASHMAP " + map.get(lettre));
        return map.get(letter);
    }
}