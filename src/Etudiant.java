public class Etudiant {

    private String nom;
    private double notes[] = new double[3];
    private double moy;
    private String resultat;

    public String getNom() {
        return nom;
    }

    public double[] getNotes() {
        return notes;
    }

    public double getMoy() {
        return moy;
    }

    public String getResultat() {
        return resultat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNotes(double[] notes) {
        this.notes = notes;
    }

    public void setMoy(double moy) {
        this.moy = moy;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public Etudiant(String nom, double notes[]) {
        this.nom = nom;
        this.notes = notes;
    }

    public double claculMoyenne() {
        for (int i = 0; i <= 3; i++) {
            moy += notes[i];
        }
        moy= moy / 4;
        return moy ;
    }

    public String resultat() {
        if (moy >= 10) {
            resultat = "Admis";
        } else {
            resultat = "Non admis";
        }
        return resultat;
    }

    public void Affiche() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("la note " + i + " : " + notes[i]);
        }
        System.out.println("la moyenne est : " + claculMoyenne());
        System.out.println("Resultat : " + resultat());
    }
}
