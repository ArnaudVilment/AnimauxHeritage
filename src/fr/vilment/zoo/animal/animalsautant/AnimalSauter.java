package fr.vilment.zoo.animal.animalsautant;

import fr.vilment.zoo.animal.Animal;

public class AnimalSauter extends Animal {

    public AnimalSauter() {
    }

    public AnimalSauter(String nom, String race, String couleur, int age, int poids) {
        super(nom, race, couleur, age, poids);
    }

    public void sauter() {
        System.out.println("Je saute!!");
    }
}
