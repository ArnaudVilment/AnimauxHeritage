package fr.vilment.zoo.animal.animalvolant;

import fr.vilment.zoo.animal.animalsautant.AnimalSauter;

public class AnimalVoler extends AnimalSauter {

    private int longuerAiles;

    public AnimalVoler() {
        super();
    }

    public AnimalVoler(String nom, String race, String couleur, int age, int poids) {
        super(nom, race, couleur, age, poids);
    }

    public void voler() {
        System.out.println("Je vole!!");
    }

    public int getLonguerAiles() {
        return longuerAiles;
    }

    public void setLonguerAiles(int longuerAiles) {
        this.longuerAiles = longuerAiles;
    }
}
