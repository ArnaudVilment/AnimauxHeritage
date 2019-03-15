package fr.vilment.zoo.animal.animalsautant;

public class Chat extends AnimalSauter {

    private boolean griffes;

    public Chat() {
        super();
    }

    public Chat(String nom, String race, String couleur, int age, int poids, boolean griffes) {
        super(nom, race, couleur, age, poids);
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