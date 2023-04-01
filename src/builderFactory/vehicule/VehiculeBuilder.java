package builderFactory.vehicule;

import builderFactory.jouet.Jouet;

public abstract class  VehiculeBuilder {
    protected Vehicule vehicule;
    abstract void poserRoues();
    abstract void poserMoteur();
    public Jouet getVehicule() {
        return vehicule;
    }
}
