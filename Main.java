

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Simulation des utilisateurs enregistrés
        List<Utilisateur> utilisateurs = new ArrayList<>();
        utilisateurs.add(new Admin(1, "Administrateur", "winnie", "admin123"));
        utilisateurs.add(new Magazinier(2, "Magasinier", "christian", "mag123")); 
        Produit produit1 = new Produit(1, "Ordinateur", 1500.00, 10);
        Telephone produit2 = new Telephone(2, "Téléphone", 800.00, 20, "Android", 4000, "12MP");
        Accessoire produit3 = new Accessoire(3, "Chargeur rapide", 30.00, 50, "Chargeur");


        // Simulation du stock
        List<Produit> stock = new ArrayList<>();
        stock.add(new Produit(1, "Ordinateur", 1500.00, 10));
        stock.add(new Telephone(2, "Téléphone", 800.00, 20, "Android", 4000, "12MP"));
        stock.add(new Accessoire(3, "Chargeur rapide", 30.00, 50, "Chargeur"));
        stock.add(new Produit(4, "Ordinateur Gamer", 2000.00, 5));
        stock.add(new Telephone(5, "iPhone", 1200.00, 15, "iOS", 3000, "12MP"));
        stock.add(new Accessoire(6, "Écouteurs sans fil", 100.00, 30, "Écouteurs"));
        stock.add(new Produit(7, "Tablette", 600.00, 8));
        stock.add(new Telephone(8, "Samsung Galaxy", 900.00, 12, "Android", 4500, "48MP"));
        stock.add(new Accessoire(9, "Câble USB-C", 10.00, 100, "Câble"));
        stock.add(new Produit(10, "Moniteur", 300.00, 20));
        stock.add(new Telephone(11, "Google Pixel", 700.00, 10, "Android", 4000, "16MP"));
        // Scanner pour les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue chez kabasubondo electronique !");
        System.out.print("Veuillez saisir votre nom: ");
        String nomUtilisateur = scanner.nextLine();

        System.out.print("Veuillez entrer votre mot de passe : ");
        String motDePasse = scanner.nextLine();

        // Authentification de l'utilisateur
        Utilisateur utilisateurConnecte = null;
        for (Utilisateur utilisateur : utilisateurs) {
            if (utilisateur.getNomUtilisateur().equals(nomUtilisateur) &&
                utilisateur.getMotDePasse().equals(motDePasse)) {
                utilisateurConnecte = utilisateur;
                break;
            }
        }

        if (utilisateurConnecte == null) {
            System.out.println("Échec de la connexion : Identifiants invalides !");
            System.exit(0); // Terminer le programme si l'utilisateur n'est pas trouvé
        } else {
            System.out.println("Connexion réussie. Bienvenue, " + utilisateurConnecte.getNomUtilisateur());
        }

        // Menu des tâches en fonction du rôle
        if (utilisateurConnecte instanceof Admin) {
            Admin admin = (Admin) utilisateurConnecte;
            int choix;
            do {
                System.out.println("\n--- Menu Administrateur ---");
                System.out.println("1. Générer un rapport");
                System.out.println("2. Modifier un produit");
                System.out.println("3. Quitter");
                System.out.print("Votre choix : ");
                choix = scanner.nextInt();

                switch (choix) {
                    case 1:
                        admin.genereRapport(stock);
                        break;
                    case 2:
                        System.out.print("Entrez l'ID du produit à modifier : ");
                        int idProduit = scanner.nextInt();
                        scanner.nextLine(); // Consommer la nouvelle ligne
                        Produit produit = null;
                        for (Produit p : stock) {
                            if (p.getIdProduit() == idProduit) {
                                produit = p;
                                break;
                            }
                        }
                        if (produit != null) {
                            System.out.print("Nouveau nom : ");
                            String nouveauNom = scanner.nextLine();
                            System.out.print("Nouveau prix : ");
                            double nouveauPrix = scanner.nextDouble();
                            System.out.print("Nouvelle quantité : ");
                            int nouvelleQuantite = scanner.nextInt();
                            admin.modifierProduit(produit, nouveauNom, nouveauPrix, nouvelleQuantite);
                        } else {
                            System.out.println("Produit introuvable !");
                        }
                        break;
                    case 3:
                        System.out.println("Déconnexion...");
                        break;
                    default:
                        System.out.println("Choix invalide.");
                }
            } while (choix != 3);
        } else if (utilisateurConnecte instanceof Magazinier) {
            Magazinier magasinier = (Magazinier) utilisateurConnecte;
            int choix;
            do {
                System.out.println("\n--- Menu Magasinier ---");
                System.out.println("1. Ajouter un produit");
                System.out.println("2. Consulter le stock");
                System.out.println("3. Quitter");
                System.out.print("Votre choix : ");
                choix = scanner.nextInt();

                switch (choix) {
                    case 1:
                        System.out.print("Entrez l'ID du produit : ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consommer la nouvelle ligne
                        System.out.print("Entrez le nom du produit : ");
                        String nom = scanner.nextLine();
                        System.out.print("Entrez le prix : ");
                        double prix = scanner.nextDouble();
                        System.out.print("Entrez la quantité : ");
                        int quantite = scanner.nextInt();
                        Produit nouveauProduit = new Produit(id, nom, prix, quantite);
                        magasinier.gererStock(stock, nouveauProduit);
                        break;
                    case 2:
                        magasinier.consulterStock(stock);
                        break;
                    case 3:
                        System.out.println("Déconnexion...");
                        break;
                    default:
                        System.out.println("Choix invalide.");
                }
            } while (choix != 3);
        }

        scanner.close();
    }
}
