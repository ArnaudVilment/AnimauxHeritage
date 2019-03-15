package fr.vilment.zoo.animal.animalvolant;


public class Aigle extends AnimalVoler {

    boolean griffes;

    public Aigle() {
        super();
    }

    public Aigle(String nom, String race, String couleur, int age, int poids) {
        super(nom, race, couleur, age, poids);
    }


    public void voler() {
        System.out.println("Je vole!!");
    }

    /**
     * @return the griffes
     */
    public boolean getGriffes() {
        return griffes;
    }

    /**
     * @param boolean the Griffes to set
     */
    public void setGriffes(boolean griffes) {
        this.griffes = griffes;
    }
}
