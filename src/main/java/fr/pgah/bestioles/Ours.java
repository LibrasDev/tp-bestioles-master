package fr.pgah.bestioles;

import java.awt.*;

public class Ours extends Bestiole {

    // private boolean polaire;
    private Color couleur;
    private boolean pencheAGauche = true;
    // private String deplacement = "\\";

    public Ours(boolean polaire) {
        //this.polaire = polaire;
        this.couleur = polaire ? Color.WHITE : Color.BLACK;
    }

    @Override
    public Action getAction(BestioleInfo info) {
        if (info.getEnFace() == Voisin.AUTRE) {
            return Action.INFECTER;
        }
        if (info.getEnFace() == Voisin.RIEN) {
            return Action.SAUTER;
        }
        return Action.GAUCHE;
    }

    @Override
    public Color getCouleur() {
        // if (polaire) {
        // return Color.WHITE;
        // }
        // return Color.BLACK;

        return couleur;
    }

    @Override
    public String toString() {
        // Exo
        // if (deplacement.equals("\\")) {
        // return "/";
        // }
        // return "\\";

        // Autre maniere

        pencheAGauche = !pencheAGauche;
        return pencheAGauche ? "\\" : "/";
    }
}
