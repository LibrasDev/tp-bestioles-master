package fr.pgah.bestioles;

import java.awt.*;

public class ChatNinja extends Bestiole {

    private boolean aTuerUnEnnemi = true;

    public ChatNinja() {
    }

    @Override
    public Action getAction(BestioleInfo info) {
        if (info.getEnFace() == Voisin.AUTRE) {
            return Action.INFECTER;
        } else if (info.getEnFace() == Voisin.MUR || info.getADroite() == Voisin.MUR) {
            return Action.GAUCHE;
        } else if (info.getEnFace() == Voisin.MEME) {
            return Action.DROITE;
        } else {
            return Action.SAUTER;
        }
    }

    @Override
    public Color getCouleur() {
        return Color.WHITE;
    }

    @Override
    public String toString() {
        if (!aTuerUnEnnemi) {
            return "Chat va chauffer";
        } else {
            return "Chat fait mal pour toi";
        }
    }
}
