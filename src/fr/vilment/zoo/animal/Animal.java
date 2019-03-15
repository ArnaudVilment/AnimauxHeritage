package fr.vilment.zoo.animal;

public class Animal {

    protected String nom;
    protected String race;
    protected String couleur;
    protected int age;
    protected int poids;

    public Animal() {
        super();
    }

    public Animal(String nom, String race, String couleur, int age, int poids) {
        super();
        this.nom = nom;
        this.race = race;
        this.couleur = couleur;
        this.age = age;
        this.poids = poids;
    }

    public void manger() {
        System.out.println("Miam miam!!");
    }

    public void courir() {
        System.out.println("Allons courir!!");
    }

    public void boire() {
        System.out.println("J'ai bien bu!!");
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the race
     */
    public String getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * @return the couleur
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * @param couleur the couleur to set
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the poids
     */
    public int getPoids() {
        return poids;
    }

    /**
     * @param poids the poids to set
     */
    public void setPoids(int poids) {
        this.poids = poids;
    }
}
