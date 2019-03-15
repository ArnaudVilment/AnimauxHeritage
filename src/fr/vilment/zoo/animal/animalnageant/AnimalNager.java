package fr.vilment.zoo.animal.animalnageant;

import fr.vilment.zoo.animal.Animal;

public class AnimalNager extends Animal {

    public AnimalNager() {
    }

    public AnimalNager(String nom, String race, String couleur, int age, int poids) {
        super(nom, race, couleur, age, poids);
    }

    public void nager() {
        System.out.println("Je nage!!");
    }
}