import java.text.SimpleDateFormat;
import java.util.Date;

public class Agent {

    private SimpleDateFormat date_em = new SimpleDateFormat("dd-MM-yyyy");

    private int matricule;
    private String nom;
    private String prenom;
    private Adresse adresse;
    private Date date_emb;

    public Agent() {
    }

    public Agent(int matricule, String nom, String prenom, Adresse adresse, Date date_emb) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.date_emb = date_emb;
    }

    public Agent(Agent agent) {
        matricule = agent.matricule;
        nom = agent.nom;
        prenom = agent.prenom;
        adresse = agent.adresse;
        date_emb = agent.date_emb;
    }

    public int getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public Date getDate_emb() {
        return date_emb;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setDate_emb(Date date_emb) {
        this.date_emb = date_emb;
    }

    @Override
    public String toString() {
        return
                "matricule = " + matricule + "\n" +
                "nom = " + nom + "\n" +
                "prenom = " + prenom + "\n" +
                "adresse = " + adresse +
                "date_emb = " + date_em.format(date_emb);
    }
}
