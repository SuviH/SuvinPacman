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
        if(this.suunta==SUUNTA.OIKEA){
            graphics.fillArc(x, y, 40, 40, 40, 280);
        }else if(this.suunta==SUUNTA.VASEN){
            graphics.fillArc(x, y, 40, 40, 220, 280);
        }else if(this.suunta==SUUNTA.YLOS){
            graphics.fillArc(x, y, 40, 40, 130, 280);
        }else if(this.suunta==SUUNTA.ALAS){
            graphics.fillArc(x, y, 40, 40, 310, 280);
        }

        
    }

    public void liiku(Kentta kentta) {
        if (suunta == SUUNTA.YLOS) {
            if (kentta.onkoKoordinaatissaSeina(this.x+20, this.y - 1)) {
                suunta = SUUNTA.ALAS;
            } else {
                this.y--;
            }

        } else if (suunta == SUUNTA.ALAS) {
            if (kentta.onkoKoordinaatissaSeina(this.x+20, this.y + 41)) {
                suunta = SUUNTA.YLOS;
            } else {
                this.y++;
            }

        } else if (suunta == SUUNTA.VASEN) {
            if (kentta.onkoKoordinaatissaSeina(this.x - 1, this.y+20)) {
                suunta = SUUNTA.OIKEA;
            } else {
                this.x--;
            }

        } else if (suunta == SUUNTA.OIKEA) {
            if (kentta.onkoKoordinaatissaSeina(this.x + 41, this.y+20)) {
                suunta = SUUNTA.VASEN;
            } else {
                this.x++;
            }

        }
    }
}
