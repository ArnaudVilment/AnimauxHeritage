package fr.vilment.zoo;

import fr.vilment.zoo.animal.Elephant;
import fr.vilment.zoo.animal.Vache;
import fr.vilment.zoo.animal.animalsautant.Chien;
import fr.vilment.zoo.animal.animalvolant.Aigle;

public class Main {

    public static void main(String[] args) {

        Vache lulu = new Vache("Lulu", "Chartreuse", "Blanche", 10, 300);
        Chien rex = new Chien("rex", "Berger", "Noir", 5, 35, true);
        Elephant bobo = new Elephant("bobo", "Afrique", "gris", 12, 650);

        System.out.println("rex est de couleur : " + rex.getCouleur());
        rex.boire();
        rex.sauter();

        System.out.println("Lulu la vache est de couleur : " + lulu.getCouleur());
        lulu.boire();

        System.out.println("Bobo l'éléphant est de couleur : " + bobo.getCouleur());

        Aigle aigle = new Aigle("Petit aigle", "rc1", "Noir", 2, 1);
        aigle.voler();
        aigle.sauter();
        aigle.boire();
        aigle.getLonguerAiles();
    }
}
