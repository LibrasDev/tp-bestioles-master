// Les crocodiles tuent dès qu'ils ont une qutre bestiole en face
// Le reste du temps ils tournent sur eux-mêmes en attendant d'autres proies.

package fr.pgah.bestioles;

import java.awt.*;

public class Crocodile extends Bestiole {

  @Override
  public Action getAction(BestioleInfo info) {
    if (info.getEnFace() == Voisin.AUTRE) {
      return Action.INFECTER;
    } else {
      return Action.GAUCHE;
    }
  }

  @Override
  public Color getCouleur() {
    return Color.GREEN;
  }

  @Override
  public String toString() {
    return "C";
  }
}