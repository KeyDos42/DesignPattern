package composite;

import java.util.HashMap;
import java.util.Map;

public class Contexte {
    Map<Lettre, Integer> map = new HashMap<>();

    public Contexte(Lettre x, int i) {
        super();
        this.put(x, i);
    }

    public int put(Lettre lettre, int i) {
        return map.put(lettre, i);
    }

    public boolean containsKey(Lettre lettre) {
        return map.containsKey(lettre);
    }

    public int getValue(Lettre lettre) {
        Integer value = map.get(lettre);
        if (value == null) {
            throw new NullPointerException();
        }
        return value;
    }

    public int get(Lettre lettre) {
        // System.out.println("HASHMAP " + map.get(lettre));
        return map.get(lettre);
    }
}