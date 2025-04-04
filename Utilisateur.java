import java.util.*;

public class Utilisateur {
    private int idUtilisateur;
    private String role;
    private String nomUtilisateur;
    private String motDePasse;

    public Utilisateur(Integer idUtilisateur, String role, String nomUtilisateur, String motDePasse) {
        this.idUtilisateur = idUtilisateur;
        this.role = role;
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
    }

    public void modifierProfile(String nouveauNom, String nouveauMotDePasse) {
        this.nomUtilisateur = nouveauNom;
        this.motDePasse = nouveauMotDePasse;
        System.out.println("Profil mis à jour : Nom = " + nouveauNom + ", Mot de passe = " + nouveauMotDePasse);
    }

    public boolean seConnecter(String nomUtilisateur, String motDePasse) {
        System.out.println("Connexion réussie pour : " + nomUtilisateur);
        return true; // Simulation, ajustez selon vos besoins
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public String getRole() {
        return role;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }
}
/*import java.util.*;
public class Utilisateur {
    private int idUtilisateur;
    private String role;
    private String nomUtilisateur;
    private String motDePasse;

    public Utilisateur(Integer idUtilisateur, String role, String nomUtilisateur, String motDePasse) {
        this.idUtilisateur = idUtilisateur;
        this.role = role;
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
    }

   

    public void modifierProfile() {

    }

    public void seConnecter() {

    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    
}*/
