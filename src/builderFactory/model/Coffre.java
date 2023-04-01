package builderFactory.model;

import builderFactory.jouet.IJouet;
import builderFactory.jouet.Jouet;
import builderFactory.jouet.JouetFactory;
import builderFactory.vehicule.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class Coffre {
    List<Jouet> jouets = new ArrayList<>();

    public Coffre() {
        for (int i = 0; i < 10; i++) {
            int max = 9;
            int min = 1;
            int range = (max - min) + 1;
            int random = (int) (Math.random() * range) + min;

            TypeJouet t = TypeJouet.get(random);
            JouetFactory jouetFactory = JouetFactory.getFactory(t);
            jouets.add((Jouet) jouetFactory.creerJouet(t));
        }
        for (IJouet jouet : jouets) {
            System.out.print(jouet.toString());
            if (jouet instanceof Vehicule) {
                System.out.print(" --> Nombre de roue : ");
                System.out.print(((Vehicule) jouet).getNbRoues());
                System.out.print("; Moteur : ");
                System.out.print(((Vehicule) jouet).getMoteur());
                System.out.println(" ---- ");
            } else {
                System.out.println("; Pas de roue ni de moteur !");
            }
        }
    }

    public static void main(String[] args) {
        new Coffre();
    }
}
