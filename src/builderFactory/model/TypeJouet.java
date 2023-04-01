package builderFactory.model;

public enum TypeJouet {
    PELUCHE_OUIOUI,
    PELUCHE_OBELIX,
    PELUCHE_CHAT,
    PELUCHE_CHIEN,
    PELUCHE_LION,
    SCOOTER,
    CAMION,
    VOITURE_BATMAN,
    VOITURE_SPIDERMAN;

    private static final TypeJouet[] VALUES = values();
    private static final int SIZE = VALUES.length;

    public static TypeJouet get(int i) {
        return VALUES[i - 1];
    }

    public static int getSize() {
        return SIZE;
    }
}
