public class Souris {
    private float poids;
    private String couleur;
    private int age;
    
    public int ESPERANCE_VIE_DEFAUT = 36;

    public Souris(float poids, String couleur, int age) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        System.out.print("Nouvelle souris !");
    }
    public Souris(float poids, String couleur) {
        this.poids = poids;
        this.couleur = couleur;
        System.out.print("Nouvelle souris !");
    } 

}
