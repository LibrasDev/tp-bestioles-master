package fr.pgah.bestioles;

import java.awt.*;

public class Yeti extends Bestiole {

    private int nbDeMouvement = 0;

    public Yeti() {
    }

    @Override
    public Action getAction(BestioleInfo info) {
        if (info.getEnFace() == Voisin.RIEN) {
            return Action.INFECTER;
        } else if (info.getEnFace() == Voisin.RIEN) {
            return Action.SAUTER;
        } else {
            return Action.DROITE;
        }
    }

    @Override
    public Color getCouleur() {
        return Color.GRAY;
    }

    @Override
    public String toString() {
        if (nbDeMouvement <= 6) {
            nbDeMouvement++;
            return "gna";
        } else if (nbDeMouvement <= 12) {
            nbDeMouvement++;
            return "gne";
        } else if (nbDeMouvement <= 18) {
            nbDeMouvement++;
            return "bah";
        } else if (nbDeMouvement <= 24) {
            nbDeMouvement++;
            return "bek";
        } else {
            nbDeMouvement = 0;
            return "gna";
        }
    }
}
