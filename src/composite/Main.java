package composite;

public class Main {
    public static void main(String[] args) {
        Operateur operateur = new Operateur();
        operateur.add(new Multiplication(4,5));
        operateur.add(new Addition(6,8));
        System.out.println(operateur.compute());
    }
}
