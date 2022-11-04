package data;

import utils.Joueur;

public class Data {

    private Joueur joueur;

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

}
