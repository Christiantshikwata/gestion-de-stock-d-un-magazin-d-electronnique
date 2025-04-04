public class Ordinateur extends Produit{
    private String processeur;
    private String ram;
    private String stockage;
    public Ordinateur(int i,String n,double p,int q, String processeur,String ram,String s){
        super(i,n,p,q);
        this.processeur=processeur;
        this.ram=ram;
        this.stockage=s;
    }
    @Override
    public void afficherProduit() {
        super.afficherProduit();
        System.out.println("processeur : " + this.processeur + ", Ram : " + this.ram + "gb, Stockage : " + this.stockage +"go");
    }
    public String getProcesseur() {
        return processeur;
    }
    public void setProcesseur(String processeur) {
        this.processeur = processeur;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getStockage() {
        return stockage;
    }
    public void setStockage(String stockage) {
        this.stockage = stockage;
    }

}
