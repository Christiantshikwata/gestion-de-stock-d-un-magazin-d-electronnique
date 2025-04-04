public class Produit {
    protected int idProduit;
    protected String nomProduit;
    protected double prix;
    protected int quantite;

    public Produit(int idProduit, String nomProduit, double prix, int quantite) {
        this.idProduit = idProduit;
        this.nomProduit = nomProduit;
        this.prix = prix;
        this.quantite = quantite;
    }

    public void ajouterProduit(int quantiteAjoutee) {
        this.quantite += quantiteAjoutee;
        System.out.println("Quantité ajoutée. Nouveau stock : " + this.quantite);
    }

    public void supprimerProduit(int quantiteRetiree) {
        if (quantiteRetiree > this.quantite) {
            System.out.println("Stock insuffisant !");
        } else {
            this.quantite -= quantiteRetiree;
            System.out.println("Quantité retirée. Nouveau stock : " + this.quantite);
        }
    }

    public void afficherProduit() {
        System.out.println("ID : " + this.idProduit + ", Nom : " + this.nomProduit + ", Prix : " + this.prix + ", Quantité : " + this.quantite);
    }

    public int getIdProduit() {
        return idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }
}
