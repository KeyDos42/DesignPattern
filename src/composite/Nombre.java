package composite;

public class Nombre extends Expression {
    private int valeur;

    public Nombre(int valeur) {
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
