import java.util.*;

public class Rapport {
    private int idRapport;
    private String typeRapport;
    private String description;
    private String admin;
    private Date dateCreation;

    public Rapport(int idRapport, String typeRapport, String description, String admin, Date dateCreation) {
        this.idRapport = idRapport;
        this.typeRapport = typeRapport;
        this.description = description;
        this.admin = admin;
        this.dateCreation = dateCreation;
    }

    public void genereRapport(List<Produit> produits) {
        System.out.println("Rapport généré par : " + this.admin);
        for (Produit produit : produits) {
            System.out.println("Produit : " + produit.getNomProduit() + ", Quantité : " + produit.getQuantite());
        }
    }

    public void afficheRapport() {
        System.out.println("Rapport ID : " + this.idRapport + ", Type : " + this.typeRapport + ", Admin : " + this.admin + ", Date : " + this.dateCreation);
    }
}
