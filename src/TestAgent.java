import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestAgent {
    public static void main(String[] args) throws ParseException {
        // write your code here

        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir le Nom : ");
        String nom = sc.nextLine();

        System.out.println("Saisir le prenom : ");
        String prenom = sc.nextLine();

        System.out.println("Saisir la Rue : ");
        String rue = sc.next();

        System.out.println("Saisir la Ville : ");
        String ville = sc.next();

        System.out.println("Saisir le Pays : ");
        String pays = sc.next();

        System.out.println("Saisir le matricule : ");
        int mat = sc.nextInt();

        System.out.println("Saisir le numero : ");
        int num = sc.nextInt();

        System.out.println("Saisir la Date : ");
        SimpleDateFormat date_em = new SimpleDateFormat("dd-MM-yyyy");
        String em = sc.next();
        Date date_emb = date_em.parse(em);


        Agent ag1 = new Agent(mat, nom, prenom, new Adresse(num, rue, ville, pays), date_emb);

        System.out.println(ag1.toString());

    }
}
