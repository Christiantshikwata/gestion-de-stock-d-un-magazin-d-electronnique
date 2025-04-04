import java.util.*;
public class Admin extends Utilisateur {
    public Admin(int i, String r, String n, String m) {
        super(i, r, n, m);
    }

    public void genereRapport(List<Produit> produits) {
        System.out.println("Rapport généré par l'administrateur : " + this.getNomUtilisateur());
        for (Produit produit : produits) {
            System.out.println("- " + produit.getNomProduit() + ", Quantité : " + produit.getQuantite());
        }
    }
    //public void ajouterUtilisateur(`)
    public void modifierProduit(Produit produit, String nouveauNom, double nouveauPrix, int nouvelleQuantite) {
        produit.setNomProduit(nouveauNom);
        produit.setPrix(nouveauPrix);
        produit.setQuantite(nouvelleQuantite);
        System.out.println("Produit modifié : " + produit.getNomProduit());
    }
}
