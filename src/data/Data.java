package data;

import utils.Joueur;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private Joueur joueur;

    private List<String> ListJoueur = new ArrayList<>();

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public Data() {

        Joueur joueur1 = new Joueur("Joueur 1", Couleur.WHITE);
        Joueur joueur2 = new Joueur("Joueur 2", Couleur.BLACK);

    }

    public List<String> getListJoueur() {
        return ListJoueur;
    }

    public String toString() {
        StringBuilder liste = new StringBuilder();
        liste.append("Voici la liste des joueurs : ");
        for (int i = 0; i < ListJoueur.size(); i++) {
            liste.append(i).append(":").append(ListJoueur.get(i)).append("\n"); // Formatage Intellij
        }
        return liste.toString();
    }
}
