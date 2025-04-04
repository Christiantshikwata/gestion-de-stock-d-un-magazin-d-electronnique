public class Accessoire extends Produit {
    private String type;

    public Accessoire(int i, String n, double p, int q, String t) {
        super(i, n, p, q);
        this.type = t;
    }

    @Override
    public void afficherProduit() {
        super.afficherProduit();
        System.out.println("type: " + this.type + "\n");
    }

    public String getType() {
        return type;
    }
}

