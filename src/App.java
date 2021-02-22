
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class App {
    public static void main(String[] args) {
        // write your code here

            Scanner sc = new Scanner(System.in);
    
            double prixTTC = 0;
    
            String cat;
    
            do {
                System.out.println("Saisire la categorie : ");
                cat = sc.nextLine();
            }while (!(cat.equals("alimentaire")) && !(cat.equals("autre")));
    
            System.out.println("Saisire le prix hortaxe : ");
            double prix_ht = sc.nextDouble();
    
            System.out.println("Saisire la Quantite : ");
            double qnt = sc.nextDouble();
    
            if(cat.equals("alimentaire")){
                prixTTC += prix_ht + (prix_ht * 0.055);
            }else {
                prixTTC += prix_ht + (prix_ht * 0.20);
            }
    
            System.out.println("Le prix TTC : "+(prixTTC*qnt));
    
        }
}
