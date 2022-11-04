package main;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bonjour ! Et bienvenue dans ce projet d'échec ! Entrez le nom de vos deux joueurs !");
        Game g = new Game(Game.getJoueur1(), Game.getJoueur2());
        g.lancer();
    }
}
