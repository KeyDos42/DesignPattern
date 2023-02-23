package composite;

import java.util.HashMap;
import java.util.Map;

public class Contexte {
    Map<Lettre, Integer> hashMap = new HashMap<>();

    public void assign(Lettre lettre, int value) {
        hashMap.put(lettre, value);
    }

    public int getValue(Lettre lettre) {
        Integer value = hashMap.get(lettre);
        if (value == null) {
            throw new NullPointerException();
        }
        return value;
    }
}