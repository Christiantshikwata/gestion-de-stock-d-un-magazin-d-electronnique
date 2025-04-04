import java.util.*;

public class Magazinier extends Utilisateur {
    public Magazinier(int i, String r, String n, String m) {
        super(i, r, n, m);
    }

    public void gererStock(List<Produit> produits, Produit nouveauProduit) {
        produits.add(nouveauProduit);
        System.out.println("Produit ajouté au stock : " + nouveauProduit.getNomProduit());
    }

    public void consulterStock(List<Produit> produits) {
        System.out.println("Stock actuel :");
        for (Produit produit : produits) {
            System.out.println("- " + produit.getNomProduit() + ", Quantité : " + produit.getQuantite());
        }
    }
}
