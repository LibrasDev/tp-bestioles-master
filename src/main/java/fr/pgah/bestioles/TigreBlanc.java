package fr.pgah.bestioles;

import java.awt.*;

public class TigreBlanc extends Bestiole {

    private boolean aTuerUnEnnemi = true;

    public TigreBlanc() {
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
        return Color.LIGHT_GRAY;
    }

    @Override
    public String toString() {
        if (!aTuerUnEnnemi) {
            return "tgr";
        } else {
            return "TGR";
        }
    }
}