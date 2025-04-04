public class Telephone extends Produit {
    private String os;
    private Integer capaciteBatterie;
    private String cameraResolution;

    public Telephone(int i, String n, double p, int q, String o, int capacite, String camera) {
        super(i, n, p, q);
        this.os = o;
        this.capaciteBatterie = capacite;
        this.cameraResolution = camera;
    }

    @Override
    public void afficherProduit() {
        super.afficherProduit();
        System.out.println("OS : " + this.os + ", Batterie : " + this.capaciteBatterie + "mAh, Caméra : " + this.cameraResolution);
    }
}

