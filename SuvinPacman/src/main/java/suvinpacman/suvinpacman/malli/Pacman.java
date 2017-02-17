/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.malli;

import java.awt.Color;
import java.awt.Graphics;
import suvinpacman.suvinpacman.malli.Herkku;
import suvinpacman.suvinpacman.malli.Hahmo;
import java.util.ArrayList;

/**
 *
 * @author suvi
 */
/**
 * Hahmo-luokan periva luokka, pelin pacman-hahmo.
 */
public class Pacman extends Hahmo {

    public Pacman(int x, int y) {
        super(x, y);
        this.suunta = SUUNTA.OIKEA;
    }

    public boolean tormaaKummitukseen(ArrayList<Hahmo> kummitukset) {
        for (Hahmo hahmo : kummitukset) {
            if (this.x == hahmo.getX() && this.y == hahmo.getY()) {
                return true;
            }
        }
        return false;
    }

    public boolean tormaaHerkkuun(ArrayList<Herkku> herkut) {
        for (Herkku herkku : herkut) {
            if (this.x == herkku.getX() && this.y == herkku.getY()) {
                return true;
            }
        }
        return false;
    }
    public void piirra(Graphics graphics) {
        graphics.setColor(Color.yellow);
        
        graphics.fillArc(x, y, 50, 50, 40, 280);
    }
}
