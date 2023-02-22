package composite;

public class Number extends Expression {
    private int valeur;

    public Number(int valeur) {
        this.valeur = valeur;
    }

    public int interpret() {
        return valeur;
    }

    @Override
    public String toString() {
        return "Entier [" +
                "valeur=" + valeur +
                "]";
    }
}
