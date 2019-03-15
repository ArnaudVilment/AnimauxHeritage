package fr.vilment.zoo.animal.animalsautant;

import fr.vilment.zoo.animal.animalsautant.AnimalSauter;

public class Poisson extends AnimalSauter {

    private boolean nagoires;

    public Poisson() {
    }

    public Poisson(String nom, String race, String couleur, int age, int poids) {
        super(nom, race, couleur, age, poids);
    }

    public boolean getNagoires() {
        return nagoires;
    }

    public void setNagoires(boolean nagoires) {
        this.nagoires = nagoires;
    }
}
