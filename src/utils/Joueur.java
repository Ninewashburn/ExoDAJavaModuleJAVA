package utils;

import data.Couleur;
import data.Position;
import models.Piece;
import models.Roi;

import java.util.List;
import java.util.ArrayList;

public class Joueur {
    private String nom;

    private Couleur couleur;
    private List<Piece> tab = new ArrayList<Piece>();

    public List<Piece> getTab() {
        return tab;
    }

    public void setTab(List<Piece> tab) {
        this.tab = tab;
    }

    private Couleur couleurEnnemie;

    public Joueur(String n, Couleur c) {
        nom = n;
        couleur = c;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void updateTab() {
        if (couleur.equals(Couleur.BLACK)) {
            tab = Piece.getBlackPiece();
            couleurEnnemie = Couleur.BLACK;

        } else {
            tab = Piece.getWhitePiece();
            couleurEnnemie = Couleur.WHITE;

        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void abandonner() {

    }


    public Piece bougerT1(Position depart) {
        Piece selectionnee = null;
        boolean ok = false;
        for (Piece count : tab) {
            if (depart.equals(count.getPosition())) {
                selectionnee = count;
                ok = true;
                System.out.println(count.getMouvementPossible());
            }
        }

        if (!ok)
            System.out.println("Position erron�e, rejouer");
        return selectionnee;

    }

    public Piece bougerRoiT1(Position depart) {
        Piece selectionnee = null;
        boolean ok = false;
        if (depart.equals(Roi.getRoiCouleur(couleur).getPosition())) {
            selectionnee = Roi.getRoiCouleur(couleur);
            ok = true;
            System.out.println(selectionnee.getMouvementPossible());

        }

        if (!ok)
            System.out.println("Position erron�e, rejouer");
        return selectionnee;

    }

    public boolean bougerT2(Piece selectionnee, Position depart, Position arrivee) {

        boolean tentative = selectionnee.bouger(arrivee);
        if (tentative) {
            for (Piece count : Piece.getColoredPiece(couleurEnnemie)) {
                if (count.getPosition().equals(arrivee)) {
                    count.destroy();
                }
            }
        } else
            System.out.println("Erreur d'arrivée");
        return tentative;
    }

    @Override
    public String toString() {
        return "Joueur [nom=" + nom + ", couleur=" + couleur + "]";
    }

}
