import java.util.Scanner;

public class MainEt {
    public static void main(String[] args) {
        // write your code here
    
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Sasire votre nom : ");
            String nom = sc.nextLine();
    
            double[] notes = new double[4];
    
            System.out.println("Sasire la note 1 : ");
            notes[0] = sc.nextDouble();
            System.out.println("Sasire la note 2 : ");
            notes[1] = sc.nextDouble();
            System.out.println("Sasire la note 3 : ");
            notes[2] = sc.nextDouble();
            System.out.println("Sasire la note 4 : ");
            notes[3] = sc.nextDouble();
    
    
            Etudiant et1 = new Etudiant(nom, notes);
            //double res = et1.calculMoyenne();
            //System.out.println(res);
            et1.Affiche();
    
        }
}
