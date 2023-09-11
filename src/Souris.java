public class Souris {
    private float poids;
    private String couleur;
    private int age;
    
    private int esperanceDeVie;
    private boolean clonee;

    private static final int ESPERANCE_VIE_DEFAUT = 36;

    public Souris(float poids, String couleur, int age) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.esperanceDeVie = ESPERANCE_VIE_DEFAUT;
        this.clonee = false;

        System.out.print("Nouvelle souris !");
    }

    public Souris(float poids, String couleur) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = 0;
        this.esperanceDeVie = ESPERANCE_VIE_DEFAUT;
        this.clonee = false;

        System.out.print("Nouvelle souris !");
    } 

    public Souris(Souris sourisClonee) {
        this.age = sourisClonee.getAge();
        this.couleur = sourisClonee.getCouleur();
        this.poids = sourisClonee.getPoids();
        this.esperanceDeVie = sourisClonee.getEsperanceDeVie() * (4/5);

        System.out.print("Clone d'une souris !");
    }


    public float getPoids() {
        return poids;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getAge() {
        return age;
    }
    public int getEsperanceDeVie() {
        return esperanceDeVie;
    }
}
