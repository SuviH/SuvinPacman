/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.malli;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import suvinpacman.suvinpacman.malli.Hahmo;

/**
 *
 * @author suvi
 */
/**
 * Hahmo-luokan periva luokka, pelin kummitus-hahmot.
 */
public class Kummitus extends Hahmo {
    private int laskuri;

    public Kummitus(int x, int y) {
        super(x, y);
        arvoSuunta();
        laskuri = 0;
        

    }

    public void piirra(Graphics graphics) {
        graphics.setColor(Color.PINK);
        graphics.fillOval(x, y, 30, 30);
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x + 8, y + 10, 7, 7);
        graphics.fillOval(x + 18, y + 10, 7, 7);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x + 9, y + 11, 3, 3);
        graphics.fillOval(x + 19, y + 11, 3, 3);

    }

    public void liiku(Kentta kentta) {
        if (suunta == SUUNTA.YLOS) {
            if (kentta.onkoKoordinaatissaSeina(this.x+15, this.y - 1) || laskuri == 250) {
                this.arvoUusiSuunta();
                laskuri=0;
            } else {
                this.y--;
            }

        } else if (suunta == SUUNTA.ALAS) {
            if (kentta.onkoKoordinaatissaSeina(this.x+15, this.y + 31) || laskuri == 250) {
                this.arvoUusiSuunta();
                laskuri =0;
            } else {
                this.y++;
            }

        } else if (suunta == SUUNTA.VASEN) {
            if (kentta.onkoKoordinaatissaSeina(this.x - 1, this.y+15) || laskuri == 250) {
                this.arvoUusiSuunta();
                laskuri = 0;
            } else {
                this.x--;
            }

        } else if (suunta == SUUNTA.OIKEA) {
            if (kentta.onkoKoordinaatissaSeina(this.x + 30 + 1, this.y+15) || laskuri ==250) {
                this.arvoUusiSuunta();
                laskuri =0;
            } else {
                this.x++;
            }

        }
        laskuri++;
    }

    public void arvoSuunta() {
        Random arpoja = new Random();
        int s = arpoja.nextInt(4);
        if (s == 0) {
            this.suunta = SUUNTA.ALAS;
        } else if (s == 1) {
            this.suunta = SUUNTA.OIKEA;
        } else if (s == 2) {
            this.suunta = SUUNTA.VASEN;
        } else if (s == 3) {
            this.suunta = SUUNTA.YLOS;
        }

    }

    public void arvoUusiSuunta() {
        SUUNTA vanhaSuunta = this.suunta;
        while (this.suunta == vanhaSuunta) {
            arvoSuunta();
        }

    }

}
